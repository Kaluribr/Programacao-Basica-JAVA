package exercicio031;

import java.util.Scanner;

public class Ex031 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n, m;
		
		System.out.println("Sua contagem regressiva vai comecar em: ");
		n = leia.nextInt();
		System.out.println("Marcar os multiplos de: ");
		m = leia.nextInt();
		
		int c = n;
		
		while(c >= 0) {
			if(c % m == 0) {
				System.out.print("[" + c + "] - ");
			}else {
				System.out.print(c + " - ");
			}
			c --;
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("FIM!");
	}

}
