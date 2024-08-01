package org.example;

public class LogicalOp {
    public int getHigherNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)
            return firstNumber;
        else
            return secondNumber;

    }

    public void countDownToHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }


    public void countDownBetweenParameters(){
        int number1 = 100;
        int number2 = 50;

        int max = getHigherNumber(number1, number2);
        int min = 2;

        while (max>=min){
            System.out.println(max);
            max--;
        }
    }

}