import java.util.Arrays;
import java.util.Scanner;

public class ArrayCompare {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter length of 1st array");
	int array1[]= new int[scan.nextInt()];
	System.out.println("Enter length of 2nd array");
	int array2[]= new int[scan.nextInt()];
	System.out.println("Enter elements of 1st Array:");
	for(int i=0;i<=array1.length-1;i++) {
		array1[i]=scan.nextInt();
	}
	System.out.println("Enter elements of 2nd Array:");
	for(int i=0;i<=array2.length-1;i++) {
		array2[i]=scan.nextInt();
	}
	System.out.println("Elements of 1st Array are:");
	for(int i=0;i<=array1.length-1;i++) {
		System.out.print(array1[i]+" ");
	}
	System.out.println();
	System.out.println("Elements of 2nd Array are:");
	for(int i=0;i<=array2.length-1;i++) {
		System.out.print(array2[i]+" ");
	}
	System.out.println();
	System.out.println("Result is:"+Arrays.compare(array1, array2));
	//Returns 0 if both arrays are equal
	//Returns -1 if 2nd array is greater than first array
	//Returns 1 if 1st array is greater
}
}
