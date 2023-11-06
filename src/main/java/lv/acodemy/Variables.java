package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");


        // int (number)
        int myCurrentAge = 19;
        System.out.println(myCurrentAge);

        /*
        TODO: Delete it later
         */

        byte myWeight = 70; // byte data type
        short salary = 1800; // short data type
        char myFirstLetterOfName = 'N'; // character data type
        long populationOfLatvia = 1900000; // long data type

        double numberPi = Math.PI;
        float randomNumber = 3190002.2020202f;
        double classicFloatingNumber = 21010.2020200203;

        //Boolean true/false is, has

        var age = 20;

        boolean isMarried = false;
        boolean isWoman = true;

        float earthSurface = 8010002919.200319292f;

        System.out.println(age);
        String position = "student";
        String field = "qa engineering";
        String experiance = "10 years";

        String fullsentence = "I am" + " " + position + " " + "with" + " " + experiance + " " + "experience" + " " + "in" + " " + field;
        System.out.println(fullsentence);

        String mySchool = "RPV";
        System.out.println("Now I am currently studying in: " + mySchool + ".");


    }
}