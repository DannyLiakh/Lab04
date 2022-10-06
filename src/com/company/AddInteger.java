package com.company;

import java.util.Scanner;

public class AddInteger {
    public static void ForLoopAdd(){
        System.out.println("Input the number between 100 – 999");
        Scanner in= new Scanner(System.in);
        int number= in.nextInt();
        int sum=0;
        String fornum = Integer.toString(number);
        for (int i=0; i<3;i++){

            sum+=Character.getNumericValue(fornum.charAt(i));
        }
        System.out.println("your sum " + sum);


    }

}
