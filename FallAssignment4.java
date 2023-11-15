package fallassignment4;

import java.util.Scanner;

public class FallAssignment4 {
//Main program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4;
       int sum;
       

        introduction();
        System.out.println();
        System.out.println("ENTER 4 INTEGERS");
        int count = 0;
        while (scan.hasNext()) {
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            num3 = scan.nextInt();
            num4 = scan.nextInt();

            if (num1 != 0 && num2 != 0 && num3 != 0 && num3 != 0) {
                System.out.println("THE FOUR ORIGINAL INTEGERS: " + num1 + " " + num2 + " " + num3 + " " + num4);
                System.out.print("THE SUM IS: ");
                int result= findSum(num1, num2, num3, num4);
                System.out.println(result);
                printMyName(result);
                System.out.println("THERE IS/ARE:" + " " + howManyEven(num1, num2, num3, num4) + " EVEN NUMBER(S)");

            }
            if (num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0) {
                System.out.println("EXIT");
                System.out.println("SETS OF DATA ENTERED: " + count);
            }
            count++;

        }
    }

    //returns nothing, just prints a description of what the program will do.
    public static void introduction() {
        System.out.printf("THIS PROGRAM WILL PROMPT THE USER TO INPUT 4 INTEGERS AND THEN IT WILL DETERMINE%n"
                + "HOW MANY INTEGERS ARE EVEN, FIND THE SUM OF THE LARGER THREE INPUTS, AND PRINT YOUR NAME%n"
                + "HOWEVER MANY TIMES THE VALUE OF THE SUM IS. IF THE SUM IS LESS THAN 0 OR MORE THAN 12, THE %n"
                + "PROGRAM WILL PRINT IT IS NOT POSSIBLE TO PRINT THE NAME.%n ");
    }
//find the sum of the larger 3 integers of the 4 entered.

    public static int findSum(int num1, int num2, int num3, int num4) {

        int result = 0;
        if (num1 < num2 && num1 < num3 && num1 < num4) {
            result = num2 + num3 + num4;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            result = num1 + num3 + num4;
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            result = num1 + num2 + num4;
        } else if (num4 < num1 && num4 < num2 && num4 < num3) {
            result = num1 + num2 + num3;

        }

        return result;
    }
//how many even numbers are entered per data set

    public static int howManyEven(int num1, int num2, int num3, int num4) {
        int count = 0;
        if (num1 % 2 == 0) {
            count++;
        }
        if (num2 % 2 == 0) {
            count++;
        }
        if (num3 % 2 == 0) {
            count++;
        }
        if (num4 % 2 == 0) {
            count++;
        }
        return count;
    }
//prints your name as many time the value of sum is.

    public static void printMyName(int numOfNames) {

        if (numOfNames < 0 || numOfNames > 12) {
            System.out.println("IT IS NOT POSSIBLE TO PRINT THE NAME");
        } else {
            for (int i = 1; i <= numOfNames; i++) {
                System.out.println("ERIN WU");
            }

        }
    }

}
