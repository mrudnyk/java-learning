package lv.acodemy;

public class SecondClassExercise {

    public static void main(String[] args) {

        int number = 10;
        if (number % 2 == 0) {
            System.out.println("This is even number!");
        } else {
            System.out.println("This is odd number!'");
        }

        // or = ||; && = and

        int x = 4;
        int y = 750;
        int z = 65;
        if (x > y && x > z) {
            System.out.println("The largest number is: " + x);
        } else if (y > x && y > z) {
            System.out.println("The largest number is: " + y);
        } else {
            System.out.println("They are equals))))");
        }

        int q = 56;

        if (q < 0) {
            System.out.println("Your number is negative!");
        } else if (q == 0) {
            System.out.println("Your number is equal 0");
        } else {
            System.out.println("Your number is positive");
        }

        double weight = 70.4;
        double height = 1.74;

        double bmi = weight / (height * weight);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
            System.out.println("Minimal health risk");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
            System.out.println("Minimal health risk");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
            System.out.println("Minimal health risk");

            int passwordLength = 11;
            int specialNumbers = 0;
            int uppercaseLetters = 1;

            if (passwordLength < 8) {
                System.out.println("Your password is weak");
            } else if (passwordLength >= 8 && passwordLength <= 11) {
                System.out.println("Your password is medium strength");
            } else if (passwordLength > 11) {
                System.out.println("Your password is strong!");
            }

            int numberDay = 4;

            if (numberDay == 1) {
                System.out.println("Today is Monday!");
            } else if (numberDay == 2) {
                System.out.println("Today is Tuesday!");
            } else if (numberDay == 3) {
                System.out.println("Today is Wednesday");
            } else if (numberDay == 4) {
                System.out.println("Today is Thursday!!");
            }


        }
    }

}
