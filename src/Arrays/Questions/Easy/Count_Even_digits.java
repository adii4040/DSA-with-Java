package Arrays.Questions.Easy;

public class Count_Even_digits {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countDigit(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }
}
