package trecipaket;

import java.util.Scanner;

public class ZbirParnih {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, n=0;
		System.out.print("Unesite prvi broj: ");
		a = sc.nextInt();
		System.out.print("Unesite drugi broj: ");
		b = sc.nextInt();
		if ( a > b ) {
			c = a;
			d = b;
		}
		else {
			c = b;
			d = a;
		}
		System.out.println("Parni brojevi izmedju " + a + " i " + b + " su: ");
		for (; c > d; d+=1) {
			if ( d % 2 == 0 ) {
				System.out.print(d + " ");
				n += d;
			}
		}
		System.out.println("\nZbir tih brojeva je " + n + "." );
	}

}
