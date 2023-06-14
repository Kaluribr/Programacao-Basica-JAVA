package exercicio036;

import java.util.Random;
import java.util.Scanner;

public class Ex036 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random r = new Random();
		int tot;
		System.out.println("Quantos numeros vou sortear? ");
		tot = leia.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Sorteando valores " + tot + " valores: \n");
		int c = 1, num, m5 = 0, d3 = 0;
		
		while(c <= tot) {
			num = r.nextInt(10) + 1;
			System.out.print(num + " - ");
			if (num > 5) {
				m5 ++;
			}
			if(num % 3 == 0) {
				d3 ++;
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c ++;
		}
		System.out.println("PRONTO!\n");
		System.out.println("-----------------------------");
		System.out.println("\nDos " + tot + " numeros sorteados");
		System.out.println("\ntemos "+ m5 + " maiores que cinco");
		System.out.println("\ne " + d3 + " divisiveis por três.\n\n");

	}

}
