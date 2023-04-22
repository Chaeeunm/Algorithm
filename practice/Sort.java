package practice;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int[] arr= {8,2,4,5,1,7,3,6};

      //  int[] arr ={2,1,3,7,5,4};
//        mergeSort(arr,0,7);
        quickSort(arr,0,7);

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


    //퀵정렬 시간복잡도 평균:nlogn보다 빠름 worst:n^2

    static void quickSort(int[] arr, int l, int r){
        if(l<r){ //종료 조건 : element가 하나 남았을 때
            int p = paritition(arr,l,r);
            System.out.println("quick arr : " + Arrays.toString(arr));

            quickSort(arr,l,p-1); //피봇을 기준으로 왼쪽 정렬
            quickSort(arr,p+1,r); //피봇을 기준으로 오른쪽 정렬

        }
    }

    static int paritition(int[]arr, int l, int r){
        int pivot = arr[r]; //제일 오른쪽 수를 피봇으로 삼는 퀵정렬
        int idx = l-1; //자리를 바꿀 인덱스 = 피봇을 기준으로 더 작은 수가 들어있는 인덱스

        //피봇의 전 위치까지 돌면서 피봇보다 작은 수를 앞 인덱스에 차례로 담아줌
        for(int j=l; j<= r-1; j++){
            if(arr[j]<=pivot){
                idx++;
                swap(arr,idx,j);
            }
        }swap(arr,idx+1,r); //피봇 보다 작은 수가 들어있는 idx 보다 한칸 뒤는 피봇의 위치가 됨
        return idx+1 ; //피봇의 위치 리턴
    }
    static void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
