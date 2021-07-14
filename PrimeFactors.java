package com.example.Primefactors;

public class PrimeFactors {
    public static void main(String[] args) {
        PrimeFactors.factors(10);
        PrimeFactors.factors(13);
        PrimeFactors.factors(1690);
    }
    public static void factors(int num) {

        int[] arr = new int[num / 2];
        int i = 2;
        int j = 0;
        while(i <= num) {
            if(num % i == 0 && PrimeFactors.prime(i)) {
                arr[j] = i;
                j++;
            }
            i++;
        }
        for(int n = 0; n < j; n++) {
            System.out.print(arr[n] + " ");
        }
        System.out.println();
    }
    public static Boolean prime(int num) {

        if(num == 2) {
            return true;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
