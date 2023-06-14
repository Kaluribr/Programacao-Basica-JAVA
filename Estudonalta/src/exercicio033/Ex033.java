package exercicio033;

import java.util.Random;
import java.util.Scanner;

public class Ex033 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random r = new Random();
		
		int tot, n, soma = 0;
		System.out.println("Quandos numeros vc quer que eu sorteie? ");
		tot = leia.nextInt();
		
		System.out.println("----------------------------------------");
		System.out.println("Sorteando o(s) " + tot + " numeros: \n");
		
		int c = 1;
		while(c <= tot) {
			n = r.nextInt(10) + 1;
			soma += n;
			System.out.print(n + " - ");
			c ++;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("PRONTO!\n");
		System.out.println("----------------------------------------");
		System.out.println("A soma de todos esses valores e igual a " + soma);
		System.out.println("\n\n");
	}

}
