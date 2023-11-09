package lv.acodemy;

public class Methods {
    public static void main(String[] args) {

        printSomeText(10, "Acodemy");
        printSomeText(5, "IT courses!");
        printName("Nikita", "Milka", 22);
        printName("Mariia", "Rudnyk", 19);


    }

    public static void printSomeText(int loopCount, String text) {

        for (int i = 0; i < loopCount; i++) ;
        System.out.println("Hello World!");

    }

    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void printSomeText(String world) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public static void printName(String name, String lastName, int age) {
        System.out.printf("My name is %s. My surname is %s. I am %d. years old \n",
                name, lastName, age);
    }


}
