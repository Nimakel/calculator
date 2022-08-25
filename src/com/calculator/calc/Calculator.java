package com.calculator.calc;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {


    public static void calc(){

        Scanner input = new Scanner(System.in);
        double num1 = 0;
        String meth = " ";
        double num2 = 0;
        double result = 0;

        if(input.hasNextInt()){
            num1 = input.nextInt();
        }else if(input.hasNextDouble()){
            num1 = input.nextDouble();
        }else System.out.println("Wrong number 1");

        if(input.hasNext()){
            meth = input.next();
        }else System.out.println("Wrong method");

        if(input.hasNextDouble()){
            num2 = input.nextDouble();
        }else if(input.hasNextInt()){
            num2 = input.nextDouble();
        }else System.out.println("Wrong number 2");

        switch(meth){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println("Result = " + result);
    }

}
