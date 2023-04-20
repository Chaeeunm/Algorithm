package practice;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int[] arr= {8,2,4,5,1,7,3,6};
        mergeSort(arr,0,7);

    }
    //Merge Sort 시간복잡도 O(nlogn)
    static void mergeSort(int[] arr, int start_idx, int end_idx){
        if(start_idx<end_idx){
            int middle = (start_idx+end_idx)/2;

            mergeSort(arr,start_idx,middle);
            mergeSort(arr,middle+1,end_idx);

            //분할 후 병합
            merge(arr,start_idx,middle,end_idx);
        }
        System.out.println("merged arr : " + Arrays.toString(arr));
       ;
    }
    //이 메서드가 실행할 일 : 시작 인덱스와 중간 인덱스를 받아 두 배열을 앞에서부터 비교하여 정렬해서 합쳐줌
    static void merge(int[] arr, int start_idx,int middle, int end_idx){
        int l = start_idx; //첫번째 배열 비교인덱스
        int r = middle+1; //두번째 배열 비교인덱스
        int idx = start_idx; //sorted 에 넣어줄 인덱스

        int[] sorted = new int[arr.length]; //정렬된 수를 넣어줄 배열
        //더 작은 수를 차례로 넣어줌
        while (l<=middle && r<= end_idx){
            if (arr[l] < arr[r]) sorted[idx++] = arr[l++];
            else sorted[idx++] =arr[r++];
        }
        //남은거 처리
        while (l<=middle) sorted[idx++] = arr[l++];
        while (r<=end_idx) sorted[idx] = arr[r++];

        //원래 배열에 정렬된 배열 넣어줌
        while (--idx>=start_idx){
            arr[idx] = sorted[idx];
        }
    }
}
