import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number to convert: ");
		double num = input.nextDouble();
		
		double milesToFeet = num * 5280;
		double feetToMiles = num / 5280;
		double inchesToMeter = num / 39.3701;
		double meterToInches = num * 39.3701;
		
		System.out.printf("Miles To Feet: %.2f \tFeet To Miles: %.2f \tInches To Meter: %.2f \tMeter To Inches: %.2f", milesToFeet, feetToMiles, inchesToMeter, meterToInches);
	}
}
