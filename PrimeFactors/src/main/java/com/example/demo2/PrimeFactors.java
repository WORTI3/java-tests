package com.example.demo2;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int input){
        List<Integer> primeNumbers = new ArrayList<Integer>();
        int divider = 2;
        while (input > 1) {
            while (input % divider == 0) { // % divides left side by right side (Modulus)
                primeNumbers.add(divider);
                input /= divider;
            }
            divider++;
        }
        return primeNumbers;
    }
}
