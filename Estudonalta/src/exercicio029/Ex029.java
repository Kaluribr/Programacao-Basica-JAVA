package exercicio029;

import java.util.Scanner;

public class Ex029 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int i, f, p;
		
		System.out.println("Onde comeca a contagem? ");
		i = leia.nextInt();
		System.out.println("Onde termina a contagem? ");
		f = leia.nextInt();
		System.out.println("Qual vai ser o incremento? ");
		p = leia.nextInt();
		
		int c = i;
		while(c <= f) {
			System.out.println("\n" + c);
			c += p;//Mesma coisa que c = c + p;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("FIM!");
	}

}
