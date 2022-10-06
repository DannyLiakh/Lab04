package com.company;
import java.util.Scanner;

public class TemperatureConversionclass {

    public static void TemperatureConversion(){
        System.out.println("In put value in Fahrenheit");
        Scanner in = new Scanner(System.in);
        int Tf = in.nextInt();

        int temp = Tf - 32;
        double Tc  = temp * 5 /9;
        System.out.println("Temperature in C " + Tc);
    }


}
