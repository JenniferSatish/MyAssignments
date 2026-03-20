package org.testleaf.com.week1.week2.homeassignments.day1;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,8,6,7};
        java.util.Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i] !=i+1){
                System.out.println("Missing Number:" +(i+1));
                break;
            }
        }
    }
    
}
