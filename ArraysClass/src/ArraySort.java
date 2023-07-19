import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length of array");
	int array[]= new int[scan.nextInt()];
	System.out.println("Enter elements of Array:");
	for(int i=0;i<=array.length-1;i++) {
		array[i]=scan.nextInt();
	}
	
	System.out.println("Elements of entered array are:");
	for(int i=0;i<=array.length-1;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
	Arrays.sort(array);
	System.out.println("Sorted array elements are:"+Arrays.toString(array));
	
}
}
