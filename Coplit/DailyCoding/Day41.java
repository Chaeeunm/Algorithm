package Coplit.DailyCoding;

public class Day41 {
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int middle = (right + left) / 2;

            if (arr[middle] == target) return middle;

            if (target < arr[middle]) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }
        }
        return -1;  //ㅎㅎ 담에 고치게씀
    }
}
