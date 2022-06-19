package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter Temp in Celsius");
        while (readme.hasNextDouble()) {
            float Fahrenheit, Celsius;
            Celsius = readme.nextFloat();
            Fahrenheit = ((Celsius * 9) / 5) + 32;
            if (Celsius < -1 ){

                System.out.println("Please enter a correct value");

            } else {

            System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
        }
    }
}}