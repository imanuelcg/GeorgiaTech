public class FahrenheitToCelcius {
        public static void main(String[] args) {
            // Declare variables
            int saturdayFahrenheit;
            int sundayFahrenheit;

            // Assigning values to variables
            saturdayFahrenheit = 78;
            sundayFahrenheit = 81;

            // Converting Fahrenheit to Celcius
            double saturdayCelcius = (5.0/9) * (saturdayFahrenheit - 32);
            double sundayCelcius = (5.0/9) * (sundayFahrenheit - 32);

            System.out.println("Weekend Averages");
            System.out.println("Saturday: " + saturdayCelcius);
            System.out.println("Sunday: " + sundayCelcius);
        }
}
