package org.example;

public class LogicalOp {
    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public String checkText(String anyString) {
        if (anyString.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String compareTextAndNumber(String anyString, int anyInt) {

        String compareText = "Evozon";

        if (anyString.equals(compareText) && anyInt <= 3) {
            return anyString + " " + anyInt;
        } else if (!anyString.equals(compareText) && anyInt > 4) {
            return anyInt + " " + anyString;
        } else {
            return "Missing condition.";
        }
    }

    public void countToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void countDownToHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }


    public void countBetweenParameters(int number1, int number2) {

        int max = checkBiggerNumber(number1, number2);
        int countNumbers = 0;
        int min = 0;

        if (max == number1) {
            min = number2;
        } else {
            min = number1;
        }

        for(int i = min; i <= max; i++) {
            countNumbers += i;
        }

        System.out.println(countNumbers);
    }
    public void countBetweenTwoParameters(int number1, int number2) {

       int countNumbers = 0;

       if (number1 > number2) {
           for(int i = number2; i <= number1; i++) {
               countNumbers += i;
           }
           System.out.println(countNumbers);
           return;
       }
        System.out.println("Missing condition.");
    }

    public void countDownToHundredUpWhile(int number) {

        while (number >= 100) {
            System.out.println(number);
            number--;
        }
    }

    public void countDownToHundredWhile(int number) {

        while (number >= -100) {
            System.out.println(number);
            number--;
        }
    }
}