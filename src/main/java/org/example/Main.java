package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        //ex 2 if
        //System.out.println("Rezultatul adunarii este: " + calc.addNumber(7,3));
        //System.out.println("Rezultatul scaderii este: " + calc.substractionNumber(7,3));
        //System.out.println("Rezultatul inmultirii este: " + calc.multiplicationionNumber(7,3));
        //System.out.println("Rezultatul impartirii este: " + calc.divisionNumber(9,3));


        LogicalOp logic = new LogicalOp();

        //ex 3 if
       // System.out.println("Rezultatul este: " + logic.checkBiggerNumber(9,3));


        //ex 4 if
        //System.out.println("Rezultatul este: " + logic.checkText("gfgjjh"));

        //ex 5 if
        //System.out.println("Rezultatul este: " + logic.checkText("gfgjjh"));
       //System.out.println("Rezultatul este: " + logic.compareTextAndNumber("Evozon", 5));

        //ex 6 if
        //System.out.println(logic.StringParameter(4));

        //ex 7 if
        //System.out.println(logic.StringAnyParameter(5));

        //ex 8 if
        //logic.intPressed(5);

        //ex 9 if
        //logic.isNumberEven(0);

        //ex 10 if
        //logic.isEligibleToVote(18);


        //ex 11 if
        //System.out.println(logic.theLargestNumber(10,16,5));

        //ex 1 for
//       logic.countToHundred(12);

        //ex 2 for
//       logic.countDownToHundred(450);

        //ex 4 for
       //logic.countBetweenParameters(4, 8);


        //ex 3 for
       //logic.countBetweenTwoParameters(1, 12);


        //ex 5 for
//        logic.allEvenNumbers();

        //ex 6 for
        //logic.allOddNumbers();

        // ex 7
        //System.out.println("Rezultatul este: " + logic.addAllNumbers(98));

        //ex 8
        //System.out.println("Rezultatul este: " + logic.upToNumberReceived(98));

        //ex 9
        //logic.displayStars();


        //ex 1 while
        logic.countDownToHundredUpWhile(1000);

        //ex 2 while
        logic.countDownToHundredWhile(10);

        //ex 3 while
        logic.countDownSmallestToLargest(10, 8);

        //ex 4 while
        logic.countBetweenParametersWhile(8, 10);

        //ex 5 while
        logic.allEvenNumbersWhile();

        //ex 6 while
        logic.allOddNumbersWhile();

        //ex 7 while
        logic.exerciseSeven();

        //ex 8 while
        System.out.println(logic.exerciseEight(1,28));









    }
}









