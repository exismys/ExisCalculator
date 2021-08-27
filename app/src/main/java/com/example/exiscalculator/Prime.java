package com.example.exiscalculator;

import java.util.ArrayList;
import java.util.List;

public class Prime extends NumberTheory {
    private int num;

    Prime(int num) {
        this.num = num;
    }

    public boolean isPrime() {
        if (num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> primeFactors() {
        List<Integer> primeFactors = new ArrayList<Integer>();
        if (num == 1) return primeFactors;
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                primeFactors.add(i);
                num = num / i;
            }
        }
        if (num > 1) {
            primeFactors.add(num);
        }
        return primeFactors;
    }
}
