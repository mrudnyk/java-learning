package lv.acodemy;

import java.util.Scanner;

public class ifElseWeekSolution {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter day of the week (0-6): ");
        String userInput = myScanner.next();

        switch (userInput) {
            case "0":
                System.out.println("Sunday");
                break;
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
        }


    }
}



