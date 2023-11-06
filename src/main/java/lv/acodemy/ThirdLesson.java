package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        //for(counter; condition; counter change) { }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        //print numbers from 1 till 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //print numbers from 10 till 0

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        String[] arrayOfNames = {"Jonh", "Tamara", "Jho Baiden", "Tatarka", "Vlad"};

        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        //for each = all elements

        for (String name : arrayOfNames) {
            System.out.println(name);
        }

        String[] countries = {"United States",
                "Canada",
                "United Kingdom",
                "Germany",
                "France",
                "Australia",
                "Japan",
                "India",
                "China",
                "Brazil"};

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("JAMETE KUDASAI!");
                break;
            }
            System.out.println(countries[i]);
        }

        // 3 number array exencher

        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {3, 4, 5, 6, 7};
        int[] thirdArray = {5, 6, 7, 8, 9};

        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) ;
                    {
                        System.out.println(numberOfSecondArray);
                    }

                }
            }
        }

        // from 0 till 100
        // print even numbers

        // for -> iterate from 0 to 100
        // if -> print even numb

        int number = 50;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int x = 1;
        int summa = 0;
        while (x <= 5) {

            summa = summa + x;
            x++;
        }
        System.out.println("Summa:" + summa);

        int y = 0;
        while (y <= 20) {
            System.out.print(y + " ");
            y = y + 2;
        }


        int z = 0;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);


    }
}
