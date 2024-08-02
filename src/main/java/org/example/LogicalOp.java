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