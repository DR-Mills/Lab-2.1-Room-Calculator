import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {

		double length = 0.00;
		double width = 0.00;
		double area = 0.00;
		double peri = 0.00;
		String userResponse;
		boolean userContinues = true;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus' Room Detail Generator!");

		while (userContinues) {
			System.out.print("\nEnter Length: ");
			length = scnr.nextDouble();
			System.out.print("Enter Width: ");
			width = scnr.nextDouble();

			peri = calcPerimeter(length, width);
			area = calcArea(length, width);

			System.out.println("The area is: " + area);
			System.out.println("The perimeter is: " + peri);

			System.out.print("\nContinue? (y/n): ");
			userResponse = scnr.next();

			userContinues = checkAnswer(userResponse);

		}
		scnr.close();
	}

	static double calcArea(double a, double b) {
		return a * b;
	}

	static double calcPerimeter(double a, double b) {
		return ((a * 2) + (b * 2));
	}

	static boolean checkAnswer(String c) {
		return c.equalsIgnoreCase("y");
	}

}
