
public class Pattern16 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			if(i==j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		for(int j=5;j>i;j--) {
			if(i==1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		for(int j=4;j>=i;j--) {
			if(i==1 || i==j ) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");

			}
		}
		
		System.out.println();
	}
	for(int i=1;i<5;i++) {
		for(int j=4;j>=i;j--) {
			if(i==j) {
		
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=i;j++) {
			if(i==4) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
				
		}
		for(int j=1;j<=i;j++) {
			if(i==j || i==4) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
