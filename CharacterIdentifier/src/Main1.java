import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the character to check:");
	char ch = scan.next().charAt(0);
	identifyCharacter(ch);
}
public static void identifyCharacter(char ch) {
	if(Character.isDigit(ch)) {
		System.out.println("Entered character "+ch+" is digit");
	}
	else if(!Character.isLetter(ch)) {
		System.out.println("Entered character "+ch+" is special symbol");
	}
	else {
		switch(Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch)) {
				System.out.println("Entered character "+ch+" is Lower-case Vowel");
			}
			else {
				System.out.println("Entered character "+ch+" is Upper-case Vowel");
			}
			break;
		default:
			if(Character.isLowerCase(ch)) {
				System.out.println("Entered character "+ch+" is Lower-case Consonent");
			}
			else {
				System.out.println("Entered character "+ch+" is Upper-case Consonent");
			}
		}
	}
}
}
