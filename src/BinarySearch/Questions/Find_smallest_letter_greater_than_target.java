package BinarySearch.Questions;

public class Find_smallest_letter_greater_than_target {
    public static void main(String[] args) {
        char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        System.out.println(findNum(letters, 'e'));
    }

    static char findNum(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if (target >= letters[end]) {
            return letters[start];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else {
                if (target == letters[mid + 1]) {
                    // If the target is equal to the mid, so we will return mid + 1 because the next character will be greater than mid since its sorted...
                    // But edge case: Although mid == target, but if the next element (mid+1) is same as mid then we cant return that element since its also equal to the target so  we will run the binary search again but from mid + 1 to the previous end because there is no point in search before mid.
                    start = mid + 1;
                } else {
                    return letters[mid + 1];
                }
            }
        }

        return letters[start];
    }
}
