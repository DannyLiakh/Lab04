package com.company;
import java.util.Scanner;
public class MortgagePayment {
    public static void mortgageCalculator(){
        System.out.println("Input the the annual interest rate");
        Scanner in= new Scanner(System.in);
        double air=in.nextDouble();
        System.out.println("Input the number of years the mortgage will be held ");
        Scanner inn= new Scanner(System.in);
        int noy=inn.nextInt();
        System.out.println("Input the mortgage amount borrowed from the bank. ");
        Scanner innn= new Scanner(System.in);
        int m =innn.nextInt();


        double mir = air / 12;
        double temp1 = mir * m;
        double temp2 = (1+mir);
        double temp3 = 12 * noy;
        double temp4 = Math.pow(temp2, temp3);
        double temp5 = 1 - (1/temp4);
        double monthly_pay =temp1 / temp5;

        // i double-checked the math and personally think the formula for monthly payment is incorrect
//(mIR * M) / (1 – (1 / (1 + mIR)^(12*nOY) ))

        double total_pay = monthly_pay * 12 * noy;
        double differnce_pay = total_pay - m;
        double procent_dif = differnce_pay / m;

        System.out.println("Annual interest rate " + air+ "%");
        System.out.println("Mortgage amount  " + m+"$");
        System.out.printf("Monthly payment %.2f", monthly_pay);
        System.out.println("$");
        System.out.printf("Total payment %.2f " ,total_pay);
        System.out.println("$");
        System.out.printf("Overpayment %.2f",differnce_pay);
        System.out.println("$");
        System.out.printf("Overpayment %.2f" , procent_dif);
        System.out.println("%");
    }
}
