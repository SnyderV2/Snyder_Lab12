import java.util.Scanner;
public class Snyder_Lab12 {
	
public static double circleArea(int radius) {
	return (Math.PI * radius * radius);
}
public static double circleCircum(int radius) {
	return (2 * Math.PI * radius);
}
public static double pyramidBaseArea(int length, int width) {
	return (length * width);
}
public static double pyramidVolume(int length, int width, int height) {
	return ((length * width * height) / 3);
}
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	//variables
	int radius;
	int length;
	int width;
	int height;
	char choice;
	
	//Write line
	System.out.println("Enter 'c' for circle or 'p' for pyramid");
	
	//User input
	choice = scnr.next().charAt(0);
	
	//if statements
	if (choice == 'c') {
		System.out.println("Enter the radius: ");
		radius = scnr.nextInt();
		System.out.println("Area: " + circleArea(radius));
		System.out.println("Circumference: " +circleCircum(radius));
	}
	if (choice == 'p') {
		System.out.println("Enter the length: ");
		length = scnr.nextInt();
		System.out.println("Enter the width: ");
		width = scnr.nextInt();
		System.out.println("Enter the height: ");
		height = scnr.nextInt();
		System.out.println("Base area: "+ pyramidBaseArea(length, width));
		System.out.println("Volume: " + pyramidVolume(length,width, height));
	}
	scnr.close();
}
}
