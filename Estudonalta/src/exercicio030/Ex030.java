package exercicio030;

import java.util.Scanner;

public class Ex030 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.println("        JOGO DO PIN         ");
		System.out.println("----------------------------");
		
		int tot;
		System.out.println("Quer contar ate quanto? ");
		tot = leia.nextInt();
		int c = 1;
		
		while(c <= tot) {
			if( c % 4 != 0) {
			System.out.print( c + " - ");
			} else {
				System.out.print("PIN - ");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c ++;
		}
		System.out.println("FIM!");
	}

}
