
public class Pattern22 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			if(i==5) {
			System.out.print("S"+"S");
			}
			else if(j==1) {
				System.out.print("S");
			}
			else {
				System.out.print(" ");
			}
		}
		for(int j=5;j>=i;j--) {
			if(i==1) {
			 System.out.print("S"+"S");
			}
			else {
				System.out.print(" ");
			}
		}
	
		System.out.println();
	}
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			if(i==5) {
			System.out.print("S"+"S");
			}
			else {
				System.out.print(" ");
			}
		}
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<i;j++) {
			System.out.print(" ");	
			
		}
		for(int j=4;j>=i;j--) {
			if(i==j) {
			System.out.print("S");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
