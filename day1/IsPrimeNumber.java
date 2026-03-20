package org.testleaf.com.week1.week2.homeassignments.day1;

public class IsPrimeNumber {
    public static void main(String[] args) {
        int n = 5;

        for(int i=2;i<n;i++){
            if (n% i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    
}
