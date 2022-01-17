package com.company.emuns;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private String operation;
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void calculate(){

        while (!"q".equals(operation)) {
            try {
                System.out.println(calculationStep());
            } catch (InputMismatchException ex){
                System.out.println("Wrong input data!");
            }
        }
    }

    private double calculationStep() throws InputMismatchException {
        System.out.println("enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter operation (only '+', '-', '*' and '/' are available) to perform or q if you want to quit");
        operation = scanner.nextLine();

        return performOperation(firstNumber, secondNumber);
    }

    private double performOperation(int firstNumber, int secondNumber) {
        double result;

        switch (operation){
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus (firstNumber, secondNumber);
                break;
            case "*":
                result = multiple (firstNumber, secondNumber);
                break;
            case "/":
                result = divide (firstNumber, secondNumber);
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
    private int plus(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private int minus(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    private int multiple(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    private double divide(int numberOne, double numberTwo){
        return numberOne / numberTwo;
    }
}
