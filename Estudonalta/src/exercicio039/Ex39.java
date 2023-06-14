package exercicio039;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n = 0, mai = 0;
		double m = 0.0, c = 0, s = 0;
		
		while(n != 9999) {
			System.out.println("\n------------------------------------");
			System.out.println("\n" + c + "° VALOR [Digite 9999 para encerrar]");
			System.out.println("\n------------------------------------");
			System.out.println("\nNÚMERO: ");
			n = leia.nextInt();
			if (n != 9999){
				s += n;
				if (c == 0) {
					mai = 0;
				}else {
					if(n > mai) {
						mai = n;
					}
				}
				c++;
			}
		}
		m = s / c;
		System.out.println("\n========================================");
		System.out.println("Ao todo, foram digitados " + c + " valores.");
		System.out.printf("A soma entre esse valores é %.0f" , s);
		System.out.printf("\nA media entre eles é %.2f" , m);
		System.out.println("\nO maior valor digitado foi " + mai);
		System.out.println("========================================");
	}

}
