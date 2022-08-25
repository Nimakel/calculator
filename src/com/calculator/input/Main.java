package com.calculator.input;
import com.calculator.calc.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       /* System.out.println("Enter your numbers.\nPlease, use this format: (number 1) + (number 2). Make sure to space out");
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        String meth = " ";
        double num2 = 0;
        double res;

        if(input.hasNextInt()){
            num1 = input.nextInt();
        }else if(input.hasNextDouble()){
            num1 = input.nextDouble();
        }else
        System.out.println("Wrong");

        if(input.hasNext()){
            meth = input.next();
        }else System.out.println("Wrong 3");

        if(input.hasNextInt()){
            num2 = input.nextInt();
        } else if(input.hasNextDouble()){
            num2 = input.nextDouble();
        }else System.out.println("Wrong 2");


        switch(meth) {

            case "*":
            { res = num1 * num2;
                System.out.println(res);
                break;}

            case "/": {
                res = num1 / num2;
                System.out.println(res);
                break;}

            case "+":{
                res = num1 + num2;
                System.out.println(res);
                break;}

            case "-":{
                res = num1 - num2;
                System.out.println(res);
                break;}
        }*/

        Calculator calculate = new Calculator();
        calculate.calc();

        }
    }


