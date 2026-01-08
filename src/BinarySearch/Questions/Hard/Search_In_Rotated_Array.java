package BinarySearch.Questions.Hard;

public class Search_In_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 4, 3, 2, 1};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (arr[start] >= arr[end]) {
            start++;
            end--;
        }

        return arr[end];
    }
}
