-- 코드를 입력하세요
SELECT CASE
         WHEN  c.START_DATE >= '2022-08-01' AND c.START_DATE <= '2022-08-31' THEN 8
         WHEN  c.START_DATE >= '2022-09-01' AND c.START_DATE <= '2022-09-30' THEN 9
         ELSE 10
         END AS MONTH,
         c.CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY c
JOIN(
    SELECT c2.CAR_ID,COUNT(*)
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY c2
    WHERE c2.START_DATE >= '2022-08-01' 
        AND c2.START_DATE <= '2022-10-31'
    GROUP BY c2.CAR_ID
    HAVING COUNT(*) >= 5
) cc ON c.CAR_ID = cc.CAR_ID
WHERE c.START_DATE >= '2022-08-01' 
    AND c.START_DATE <= '2022-10-31'
GROUP BY c.CAR_ID,
        CASE
         WHEN  c.START_DATE >= '2022-08-01' AND c.START_DATE <= '2022-08-31' THEN 8
         WHEN  c.START_DATE >= '2022-09-01' AND c.START_DATE <= '2022-09-30' THEN 9
         ELSE 10
         END
ORDER BY MONTH ASC , c.CAR_ID desc

# START_DATE 기준으로 2022 08부터 2022 10 까지 총 대여횟수가 5회이상인 자동차들에 대해
# 해당 기간동안의 월별 자동차 ID별 총 대여횟수(RECORDS) 리스트

# 월을 기준으로 오름차순, 월이 같다면 자동차 id기준 내림차순
# 특정 월 대여횟수가 0이면 제외