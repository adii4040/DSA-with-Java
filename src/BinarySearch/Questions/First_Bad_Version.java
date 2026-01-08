package BinarySearch.Questions;

public class First_Bad_Version {
    public static void main(String[] args) {

    }


    //I directly solved this ques on leetcode since they have provided the API.

    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                if (isBadVersion(mid - 1)) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static boolean isBadVersion(int n) {
        return true;
    }
}
