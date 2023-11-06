package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 8, 10, 11};
        int myNumber = numbers[4];
        System.out.println(myNumber);

        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);

        int[] emptyArray = new int[30];
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[0] = 10;
        emptyArray[3] = 3;
        emptyArray[5] = 50;
        emptyArray[8] = 10000;
        System.out.println(Arrays.toString(emptyArray));

        String[] fruitBasket = {"apple", "banana", "kiwi", "pear"};
        String fruit = fruitBasket[3];
        System.out.println(fruitBasket[3]);

        if (10 > 5) {
            System.out.println("This statement is true!");
        }

        if (fruitBasket[0].equals("apple")) {
            System.out.println("Yes, you find apples!!!!!");
        }

        boolean isSummer = false;

        if (isSummer) {
            System.out.println("We will lay on a beach!!!!!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("We will watch Netflix series!");
        }

        //String light = "RED";

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color: ");
        String light = myScanner.next();

        if (light.equals("GREEN")) {
            System.out.println("You can go!");
        } else if (light.equals("YELLOW")) {
            System.out.println("DON'T GO WAIT FOT GREEN!!");
        } else if (light.equals("RED")) {
            System.out.println("Don't go u fucking pidor!");
        } else {
            System.out.println("Traffic rules are violated you are dead))");
        }

    }
}
