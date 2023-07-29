
public class Pattern24 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		char ch='A';
		for(int j=5;j>=i;j--) {
			System.out.print(ch++);
		}
		for(int j=1;j<i;j++) {
			System.out.print(" "+" ");
		}
		char ch1=(char)(ch-1);
		for(int j=5;j>=i;j--) {
			System.out.print(ch1--);
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++) {
		char ch='A';
		for(int j=1;j<=i;j++) {
			System.out.print(ch++);
		}
		for(int j=5;j>i;j--) {
			System.out.print(" "+" ");
		}
		
		char ch2 =(char)(ch-1);
		for(int j=1;j<=i;j++) {
			System.out.print(ch2--);
		}
		System.out.println();
	}

}
}
