package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int biggest = op.getHigherNumber(7, 3);
        System.out.println("The bigger number is: " + op.getHigherNumber(7,3));

        op.countDownToHundred(5);
        op.countDownBetweenParameters();



        //Nume si prenume
        String numeIntreg = "Grigor Luiza";
        System.out.println("Hellou");
        System.out.println("Nume: " + numeIntreg);


        int numberX = 5;
        int numberY = 10;
        int result = numberY + numberX;
        System.out.println(result);


        float numberM = 5.5F;
        int numberN = 2;
        float resultM = numberM / numberN;
        System.out.println(resultM);


        //Exercitiu a.
        int number1 = -5;
        int number2 = 8;
        int number3 = 6;
        int resultA = number1 + number2 * number3;
        System.out.println(resultA);


        //Exercitiu b.
        int a = 55;
        int b = 9;
        int c = 9;
        int resultB = (a + b) % c;
        System.out.println(resultB);


        //Exercitiu c.
        int d = 20;
        int e = -3;
        int f = 5;
        int g = 8;
        int resultC = d + e * f / g;
        System.out.println(resultC);


        //Exercitiu d.
        int numberA = 5;
        int numberB = 15;
        int numberC = 3;
        int numberD = 2;
        int numberE = 8;
        int numberF = 3;
        int resultD = numberA + numberB / numberC * numberD - numberE % numberF;
        System.out.println(resultD);


        speed(9500, 20, 10, 30);




        circle(20);





        printPattern();



    }

    public static void printPattern () {
        System.out.println(" +" + '"' + '"' + '"' + '"' + '"' + "+");
        System.out.println("[" + '|' + ' ' + 'o' + ' ' + 'o' + ' ' + '|' + "]");
        System.out.println(" " + '|' + " " + " " + "^" + " " + " " + '|' + " ");
        System.out.println(" " + '|' + ' ' + "'" + '-' + "'" + " " + '|' + " ");
        System.out.println(" +" + '-' + '-' + '-' + '-' + '-' + "+");
    }

    public static void circle ( double raza){
        double perimeter = 2 * Math.PI * raza;
        double area = Math.PI * Math.pow(raza, 2);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Aria: " + area);
    }

    public static void speed ( double distance, int hour, int min, int sec){
        int timeInSeconds = hour * 3600 + min * 60 + sec;
        double mPerSec = distance / timeInSeconds;
        double kmPerSec = mPerSec * 3.6;
        double milePerHour = 1609 * distance;
        System.out.println("Viteza m/sec: " + mPerSec);
        System.out.println("Viteza km/sec: " + kmPerSec);
        System.out.println("Viteza miles/hour: " + milePerHour);
    }
}









