
public class Pattern5 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		int k=1;
		for(int j=5;j>=i;j--) {
			System.out.print(k++);
		}
		System.out.println();
	}
}
}
