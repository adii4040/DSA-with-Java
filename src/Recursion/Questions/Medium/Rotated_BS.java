package Recursion.Questions.Medium;

public class Rotated_BS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.println(findInRotatedArr(arr, 9, 0, arr.length - 1));

    }

    static int findInRotatedArr(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }

        //Check if the mid is in the first half or in the second half

        //Case1: First Half
        if (arr[start] < arr[mid]) {
            //Now check if the target lies in this range
            if (target >= arr[start] && target < arr[mid]) {
                return findInRotatedArr(arr, target, start, mid - 1);
            } else {
                //If target is not in the above range, this means it lies on the right side.
                return findInRotatedArr(arr, target, mid + 1, end);
            }
        } else {
            //Case2: Second Half

            //If we are in the second half, lets check if the target lies on the right side of the second half
            if (target > arr[mid] && target <= arr[end]) {
                return findInRotatedArr(arr, target, mid + 1, end);
            } else {
                //If target  does not lie on the right  side, this means it will be on the left side, therefor check the left side
                return findInRotatedArr(arr, target, start, mid - 1);
            }
        }

    }
}

