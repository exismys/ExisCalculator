package com.example.exiscalculator;

public class NumberTheory {

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

    public static int gcdMultiple(int[] nums) {
        int gcd = gcd(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            gcd = gcd(gcd, nums[i]);
        }
        return gcd;
    }
}
