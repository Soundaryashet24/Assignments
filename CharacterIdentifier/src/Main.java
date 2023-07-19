import java.util.Scanner;

public class Main {
public static void identifyCharacter(char ch) {
	if(Character.isLetter(ch)== true) {
		if(Character.isUpperCase(ch)) {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("Upper-case Vowel");
			}
			else {
				System.out.println("Upper-case Consonant");
			}
		}
		else {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("Lower-case Vowel");
			}
			else {
				System.out.println("Lower-case Consonant");
			}
		}
	}
	else {
		System.out.println("Please enter a character");
	}
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter character:");
	char ch = scan.next().charAt(0);
	identifyCharacter(ch);
}
}
