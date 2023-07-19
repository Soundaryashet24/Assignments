import java.util.Arrays;
import java.util.Scanner;

public class ArrayFill {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length of array");
	int array[]= new int[scan.nextInt()];
	System.out.println("Enter value to be filled:");
	int value = scan.nextInt();
	Arrays.fill(array, value);
	System.out.println("Elements of entered array are:");
	for(int i=0;i<=array.length-1;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
}
}
