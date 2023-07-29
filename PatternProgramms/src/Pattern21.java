
public class Pattern21 {
public static void main(String[] args) {
	for(int i=1;i<5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print("*");
		}
		String str="JAVA";
		for(int j=1;j<=i;j++) {
			System.out.print(str.charAt(i-1)+" ");
			
		}
		for(int j=5;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
