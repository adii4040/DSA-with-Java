package Recursion.Theory.Array;

import java.util.ArrayList;

public class LinearSearch_impConcepts {
    public static void main(String[] args) {
        int[] arr = {6, 2, 13, 6, 8, 9, 10, 6, 12, 8, 6};
        int target = 6;
        //System.out.println(checkTargetExists(arr, target, 0));
        findAllIndex(arr, target, 0);

        ArrayList<Integer> list1 = new ArrayList<>();
        findAllIndexList(arr, target, 0, list1);
        //System.out.println(list1);


        System.out.println(findAllIndexWithoutListArgs(arr, target, 0));

    }

    static int recursiveLS(int[] arr, int target, int index) {
        if (index == arr.length) { // We are not checking the last element because there could be a chance that the target is at the last index so we need to check it too, and if the index = length of the array, this means we are out of the array we still didn't get the target element so just return -1.
            return -1;
        }
        if (arr[index] != target) {
            return recursiveLS(arr, target, index + 1);
        }
        return index;
    }


    static boolean checkTargetExists(int[] arr, int target, int index) {
        if (index == arr.length) { // We are not checking the last element because there could be a chance that the target is at the last index so we need to check it too, and if the index = length of the array, this means we are out of the array we still didn't get the target element so just return -1.
            return false;
        }
        return arr[index] == target || checkTargetExists(arr, target, index + 1); // If we got the target then no need to check further, thus we are using ||.
    }


    // Create an array of the indexes with the target, since we don't know how many number of targets are there so we will use arraylist
    static ArrayList<Integer> list = new ArrayList<>();

    // We don't need to return anything as we will add the index in the function itself
    static void findAllIndex(int[] arr, int t, int i) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == t) {
            list.add(i);
        }
        findAllIndex(arr, t, i + 1);
    }


    // Earlier we were defining the arraylist outside the function, now we will pass it in the argument
    static ArrayList findAllIndexList(int[] arr, int t, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == t) {
            list.add(i);
        }
        return findAllIndexList(arr, t, i + 1, list);
    }


    // Return an ArrayList without passing it in the arguments

    static ArrayList findAllIndexWithoutListArgs(int[] arr, int t, int i) {
        ArrayList<Integer> list =  new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == t) {
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexWithoutListArgs(arr, t, i + 1); // This will contain the value of list from each function call.

        list.addAll(ansFromBelowCalls);
        return list;
    }


}
