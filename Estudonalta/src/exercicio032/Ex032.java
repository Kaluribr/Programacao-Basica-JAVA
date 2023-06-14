package exercicio032;

import java.util.Scanner;

public class Ex032 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int c = 1 , n;
		int par = 0, impar = 0;
		while(c <= 5) {
			System.out.println("Digite o " + c + "°. valor: ");
			n = leia.nextInt();
			if(n % 2 == 0) {
				par += n;
			}else {
				impar += n;
			}
			c ++;
		}
		System.out.println("------------------------------------");
		System.out.println("\nA soma dos pares deu " + par);
		System.out.println("\nA soma dos impares deu " + impar);
	}

}
