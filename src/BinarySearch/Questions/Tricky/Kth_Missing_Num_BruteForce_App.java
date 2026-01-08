package BinarySearch.Questions.Tricky;

public class Kth_Missing_Num_BruteForce_App {
    public static void main(String[] args) {
        int[] arr = {4,6,15,17};
        int k = 14;
        System.out.println(findKthPositive(arr, k));
    }

    static int findKthPositive(int[] arr, int k) {
        int i = 0;
        int j = i + 1;
        int count = 0;
        while (i < arr.length) {
            if (count == k) {
                return j - 1;
            }
            if (arr[i] != j) {
                j++;
                count++;
            } else {
                i++;
                j++;
            }
        }
        if (count == 0) {
            return arr[arr.length - 1] + k;
        } else {
            while(count != k ){
                j++;
                count++;
            }

            return j-1;
        }
    }
}
