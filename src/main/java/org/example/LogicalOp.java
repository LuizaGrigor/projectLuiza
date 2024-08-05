package org.example;

import java.util.Arrays;

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


    public String StringParameter( int anyParameter) {

        if ((anyParameter > 8) || (anyParameter == 6)) {
            return "The amount of snow this winter was(cm): "  + anyParameter;
        } else {
            return "The forecast snow is(cm): " + anyParameter;
        }
    }


    public String StringAnyParameter( int anyParameter) {

        if ((anyParameter > 3) && (anyParameter != 4)) {
            return "The number is greater than 3 and not equal to: "  + anyParameter;
        } else if (anyParameter == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }


    public void intPressed( int anyParameter) {

        switch (anyParameter) {
            case 1:
                System.out.println("The number is: 1!");
                break;

            case 2:
                System.out.println("The number is: 2!");
                break;

            case 5:
                System.out.println("The number is: 5!");
                break;

            default:
                System.out.println("Missing condition!");
        }
    }


    public void isNumberEven (int parameter) {
        if (parameter <= 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public void isEligibleToVote (int age) {
        if (age > 18) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public int compareThelargestNumber (int number1, int number2) {

        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
    public int theLargestNumber (int number1, int number2, int number3) {
        if (compareThelargestNumber(number1,number2) > number3) {
            return compareThelargestNumber(number1, number2);
        } else {
            return number3;
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

    /**
     * Problem 4
     * @param number1
     * @param number2
     */
    public void countBetweenTwoParameters(int number1, int number2) {

       int countNumbers = 0;

       if (number1 > number2) {
           for(int i = number2; i <= number1; i++) {
               countNumbers += i;
           }
           System.out.println(countNumbers);
       }
        System.out.println("Missing condition.");
    }

    public void countBetweenParameters(int number1, int number2) {

        int max = this.checkBiggerNumber(number1, number2);
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

    public void allEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    public void allOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int addAllNumbers (int startNumber)
    {
        if (startNumber > 100) {
            return 0;
        }
        int total = 0;

        for (int i = startNumber; i <=100; i++) {
            total += i;

        }
        return total;
    }


    public int upToNumberReceived (int startNumber)
    {
        if (startNumber > 100) {
            return 0;
        }

        int total = 0;
        int k = 0;

        for (int i = startNumber; i <=100; i++) {
            total += i;
            k++;
        }

        return total / k;
    }


    public void displayStars()
    {
        int noOf = 7;

        for (int i = 0; i < noOf; i++)
        {
            for (int j = 0; j < noOf - i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public void countDownToHundredUpWhile(int number)
    {
        while (number >= 100) {
            System.out.println(number);
            number--;
        }
    }


    public void countDownToHundredWhile(int number)
    {
        while (number >= -100) {
            System.out.println(number);
            number--;
        }
    }


    public void countdownBetweenTwoNumbers(int number1, int number2)
    {
        if (number1 < number2) {
            System.out.println("Missing condition.");
            return;
        }
        while (number2 >=number1) {
        System.out.println(number1);
        number1--;
        }
    }

    public void countDownSmallestToLargest( int number1, int number2)
    {

        int countNumbers = 0;

        if (number1 > number2)
        {
            int i = number2;
            while (i <= number1) {
                countNumbers += i;
                i++;
            }
            System.out.println(countNumbers);

        } else {
            System.out.println("Missing condition.");
        }

    }

    public void countBetweenParametersWhile(int number1, int number2) {

        int max = number1;
        int countNumbers = 0;
        int min = 0;

        if (max > number2) {
            min = number2;
        } else {
            max = number2;
            min = number1;
        }

        int i = min;
        while ( i <= max) {
            countNumbers += i;
            i++;
        }

        System.out.println(countNumbers);
    }

    public void allEvenNumbersWhile()
    {
        int i = 1;
        while (i <= 100)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }

    public void allOddNumbersWhile()
    {
        int i = 1;
        while ( i <= 100)
        {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void exerciseSeven()
    {
        int i = 111;
        int j = 1;
        int countNumber = 0;

        while (i <= 8899)
        {
            countNumber += i;
            i++;
            j++;
        }
        System.out.println("Rezultatul pentru suma este: " + countNumber);
        System.out.println("Rezultatul pentru media aritmetica este: " + countNumber/j);
    }

    public int exerciseEight(int number1, int number2)
    {
        int contNumber = 0;
        int j = 0;
        int min = number1;
        int max = number2;

        if (number1 > number2)
        {
           max = number1;
           min = number2;
        }

        int i = min;
        while (i <= max)
        {
            if (i % 7 == 0) {
                contNumber += i;
                j++;
            }
            i++;
        }

        return contNumber / j;
    }

    public void myArray ()
    {
        int [] myArray = new int [100];
                    for (int i = 0; i < 100; i++)
                    {
                        myArray[i] = i +1;
                        System.out.println(myArray[i]);
                    }

    }


    public int[] myEvenArray()
    {
        int [] myArray = new int [50];
        {
            int j = 0;
            for (int i = 1; i <= 100; i++)
                if (i % 2 == 0) {
                    myArray[j] = i ;
                    System.out.println(myArray[j]);
                    j++;
                }
            return myArray;
        }
    }


    public int myAverageArray(int [] myArray)
    {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++)
            {
                sum += myArray[i];

            }

        return sum/myArray.length;
    }


    public boolean isInList(String[] list1, String secondString)
    {
        for (int i = 0; i < list1.length; i++)
            if (list1[i].equals(secondString))
                return true;
        return false;
    }

    public int posistionOfTheNumber(int [] myArray, int secondNumber)
    {
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] == secondNumber)
                return i;
        return -1;
    }


    public void strangeFormOfArt()
    {
        int lenght = 10;
        for (int i = 0; i < lenght; i++)
        {
            int j = 0;
            for (j = 0; j < lenght; j++)
            {
                System.out.print (" -");
            }
            System.out.println();
        }

    }

    public void myArrayDisplay()
    {
        String[] myArray = {"-","-","-","-","-","-","-","-","-","-","-"};
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++){
                System.out.print(myArray[j]);
            }
            System.out.println();
            System.out.println();

        }

    }



}
