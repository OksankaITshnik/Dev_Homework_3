package org.example;

public class SumCalculator {

    int sum (int n){
        if (n < 1){
            throw new IllegalArgumentException();
        }
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
        }
        return result;
    }
}