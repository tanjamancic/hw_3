package trecipaket;

import java.util.Scanner;

public class ProstBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean pro = true;
		System.out.print("Unesite broj: ");
		a = sc.nextInt();
		if ( a <= 1 ) System.out.println("Broj nije ni prost ni slozen.");
		else if ( a == 2 ) System.out.println("Broj je prost.");
		else {
			for ( b = 2 ; b < a ; b ++ ) {
				if ( a % b == 0) pro = false ;
			}
			if ( pro ) System.out.println("Broj je prost.");
			else System.out.println("Broj nije prost.");
		}	
	}
}