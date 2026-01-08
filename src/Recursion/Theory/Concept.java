package Recursion.Theory;

public class Concept {
    public static void main(String[] args) {
        __n(5);
    }

    static void n__(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n__(n--);

        // n-- will pass the value of n first and when the function is over then it will subtract by 1 , this is why we use n-- in for loop.
        //And for n = 5, the value of  5 has never changed and in every new function call the value of n is 5 only thus will run for infinity.
    }

    static void __n(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        __n(--n);

        // --n will subtract the value of n by 1 and the subtracted result is passed in the function this is why we don't use in the for loop.
        // For n = 5, n will be subtracted by 1 first therefor it will become 4 and then 4 is passed in the next function call.
    }
}
