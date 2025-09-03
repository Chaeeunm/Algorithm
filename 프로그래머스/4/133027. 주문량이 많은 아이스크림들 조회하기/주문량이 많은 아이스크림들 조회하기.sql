-- 코드를 입력하세요

# SELECT COALESCE (f.FLAVOR,j.FLAVOR) AS FLAVOR
# FROM JULY j
# LEFT JOIN FIRST_HALF f ON f.FLAVOR = j.FLAVOR
# ORDER BY COALESCE(f.TOTAL_ORDER, 0) + COALESCE(j.TOTAL_ORDER, 0) desc
# LIMIT 3

select j.FLAVOR
from (
    select FLAVOR, sum(TOTAL_ORDER) as TOTAL_ORDER
    from JULY
    group by FLAVOR
) j
left join (
    select FLAVOR, sum(TOTAL_ORDER) as TOTAL_ORDER
    from FIRST_HALF
    group by FLAVOR
) fh
on j.FLAVOR = fh.FLAVOR
order by (j.TOTAL_ORDER + fh.TOTAL_ORDER) desc -- 집계함수: select,having,order by에 사용 가능
limit 3;