package bonjour;

//import java.io.*;
import java.util.Scanner;

public class ScanXan {

	public static void main(String[] args) {
		
		String prenom;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre prénom ?");
		prenom=sc.nextLine();
		System.out.println("Votre prénom est "+prenom);
	}
}