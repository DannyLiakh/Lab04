package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void fiboCalculate(){
        System.out.println("input number for fibonacci");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        for(int i = 0; i < num; i++) {
            if (num1 == 0 && num2 == 0) {
                sum = num1 + num2;
                System.out.println(sum);
                num2 = 1;
            }else {
                System.out.println(sum);
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
        }

    }
}
