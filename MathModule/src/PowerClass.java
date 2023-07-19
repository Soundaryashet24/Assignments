import java.util.Scanner;

public class PowerClass {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter value of base:");
	double base = scan.nextDouble();
	System.out.println("Enter value of exponent:");
	double exponent = scan.nextDouble();
	double result=Math.pow(base, exponent);
	System.out.println("Result is: "+result);
}
}
