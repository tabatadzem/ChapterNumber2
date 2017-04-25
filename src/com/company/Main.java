package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number1 = (int) System.currentTimeMillis()%10;
	int number2 = (int)System.currentTimeMillis()/7%10;
	System.out.print("please enter the answer for number1 + number2");
	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));




    }
}
