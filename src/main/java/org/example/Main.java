package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(FibonachiCalculator.fibonachiOne(6)); // time - O(n) memorry - O(1)
        System.out.println(FibonachiCalculator.fibonachiTwo(6)); // time - O(2^n) memory - O(n)
        System.out.println(FibonachiCalculator.fibonachiThree(6)); // time O(n) memory O(n)

    }
}