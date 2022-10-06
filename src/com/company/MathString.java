package com.company;

import java.util.Scanner;

public class MathString {
    public static void mathPowers(){
        System.out.println("input big number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("n" + "\t" + "n^2" + "\t" + "n^3" + "\t" + "n^4");
        for(int i = 0; i < num; i++){
            int mul = i + 1;
        System.out.println(mul + "\t" + (int)Math.pow(mul, 2) + "\t" + (int) Math.pow(mul, 3) + "\t" + (int)Math.pow(mul, 4));
        }

    }
}
