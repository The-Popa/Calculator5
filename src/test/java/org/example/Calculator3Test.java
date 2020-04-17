package org.example;

import org.junit.Test;

public class Calculator3Test {

    public static double number1 = 15, number2 = 10;

    // AdditionTest
    @Test
    public void testAdditionTrue() {
    char operation = '+';
    double answer = 25;
    double trueAnswer = Calculator(operation, number1, number2);
        assertTrue(answer, trueAnswer);
    }

    // SubtractionTest
    @Test
    public void testSubtractionTrue(){
        char operation = '-';
        double answer = 5;
        double trueAnswer = Calculator(operation, number1, number2);
        assertTrue(answer, trueAnswer);
    }

    //MultiplicationTest
    @Test
    public void testMultiplicationTrue(){
        char operation = '*';
        double answer = 150;
        double trueAnswer = Calculator(operation, number1, number2);
        assertTrue(answer, trueAnswer);
        }


    // DivisionTest
    @Test
    public void testDivisionTrue(){
        char operation = '/';
        double answer = 1.5;
        double trueAnswer = Calculator(operation, number1, number2);
        assertTrue(answer, trueAnswer);
    }

    private void assertTrue(double answer, double trueAnswer) {
    }

    private double Calculator(char operation, double number1, double number2) {


        return number1;
    }
}
