package lv.acodemy;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(Math.round(fahrenheitConverter(120)));
        System.out.println(fahrenheitConverter(120));

        System.out.println(currencyConverter("CZK", 50));


    }

    public static double fahrenheitConverter(double fahrenheit) {
        return (fahrenheit - 32) / 1.80000;
    }

    public static double currencyConverter(String currency, double money) throws Exception {
        double convertedAmount;
        switch (currency) {
            case "PLN":
                convertedAmount = money * 4.45;
                break;
            case "CZH":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.85;
                break;
            default:
                throw new RuntimeException("Unsupported currency: " + currency);
        }
        return convertedAmount;

        public static boolean isPalindrome (String word){
            String reversed = "";
            for (int i = word.length(-1); i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }
            System.out.println(reversed);
            return true;


            public static double calculator (String operation,double number1, double number2){
                double result = 0;
                switch (operation) {
                    case "+"
                }
            }


        }

    }


}
