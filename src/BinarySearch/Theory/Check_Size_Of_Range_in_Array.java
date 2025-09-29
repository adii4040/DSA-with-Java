package BinarySearch.Theory;

public class Check_Size_Of_Range_in_Array {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.println(checkSize(0, 5));
    }

    static int checkSize(int start, int end) {
        // end - (start - 1)
        return end - start + 1 ;
    }
}
