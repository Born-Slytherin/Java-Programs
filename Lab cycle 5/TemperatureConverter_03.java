import java.util.Scanner;

public class TemperatureConverter_03 {

    void ConvertToCelsius(int temperature) {
        float celsius = (float) ((temperature - 32) * 5.0 / 9.0);
        System.out.printf("%n%d Fahrenheit is equal to %.2f Celsius%n%n", temperature, celsius);
    }

    

    void ConvertToCelsius(float temperature) {
        float celsius = (temperature - 32) * 5 / 9;
        System.out.printf("%n%.2f Fahrenheit is equal to %.2f Celsius%n%n", temperature, celsius);
    }    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        TemperatureConverter_03 converter = new TemperatureConverter_03();

        System.out.print("Enter fahrenheit in integer format: ");
        int fahrenheit = scanner.nextInt();

        converter.ConvertToCelsius(fahrenheit);

        System.out.print("Enter fahrenheit in float format: ");
        float fahrenheitFloat = scanner.nextFloat();

        converter.ConvertToCelsius(fahrenheitFloat);

        scanner.close();
    }
}
