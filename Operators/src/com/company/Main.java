package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println(previousResult + " + 1 = " + result);
        result++;
        System.out.println("Result is now: " + result);
        result--;
        System.out.println("Result is now: " + result);

        result += 2;
        System.out.println("Result is now: " + result);

        result *= 10;
        System.out.println("Result is now: " + result);

        result -= 10;
        System.out.println("Result is now: " + result);

        result /= 10;
        System.out.println("Result is now: " + result);

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 101))
            System.out.println("Greater than second top score and less than 101");

        if((topScore > 110) || (secondTopScore <= 90))
            System.out.println("One of these scores is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true: false;
        if (wasCar)
            System.out.println("wasCar is true");


        double firstDouble = 20;
        double secondDouble = 80;
        double totalOfDoubles = (firstDouble + secondDouble) * 25;
        System.out.println("My Total: " + totalOfDoubles);
        double remainder = totalOfDoubles % 40;
        if (remainder <= 20)
            System.out.println("Total was over the limit: " + remainder);




    }
}
