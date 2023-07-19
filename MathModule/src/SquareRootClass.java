import java.util.Scanner;

public class SquareRootClass {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to find the square root: ");
	double number = scan.nextInt();
	double result = Math.sqrt(number);
	System.out.println("Result is :"+result);
	
}
}
