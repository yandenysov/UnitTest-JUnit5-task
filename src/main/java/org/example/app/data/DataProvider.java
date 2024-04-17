package org.example.app.data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataProvider {

    public double getTemperature() {
        Scanner scanner = new Scanner(System.in);
        double temperature = 0;

        try {
            System.out.println("Enter temperature from -10 to +35 degrees Celsius: ");
            temperature = scanner.nextDouble();
            return temperature;
        } catch (InputMismatchException e) {
            return Double.NaN;
        }
    }
}
