package aula14;

import java.util.Scanner;

public class LacosAninhados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x, y;
		
		for(x = 1; x <= 3; x++) {
			for(y = 1; y <= 2; y++) {
				System.out.println( x + " " + y + "\n");
			}
		}
		
	}

}
