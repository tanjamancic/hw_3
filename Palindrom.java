package trecipaket;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int i, m, n, p = 0;
		System.out.print("Unesite broj: ");
		i = sc.nextInt();
		n = i;
		while ( i > 0 ) {
			m = i % 10;
			p *= 10;
			p += m;
			i /= 10;
		}
		if ( n == p ) System.out.println("Broj je palindrom.");
		else System.out.println("Broj nije palindrom.");
	}

}


