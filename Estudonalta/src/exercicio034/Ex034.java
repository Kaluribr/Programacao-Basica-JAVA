package exercicio034;

import java.util.Scanner;

public class Ex034 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int cont = 1, num;
		int tp = 0, ti = 0, sp = 0, si = 0;
		
		while (cont <= 5) {
			System.out.println("Digite um numero inteiro: ");
			num = leia.nextInt();
			if(num % 2 == 0) {
				tp++;
				sp += num;
			}else {
				ti++;
				si += num;
			}
			cont++;
		}
		float mp = (float) sp / tp;
		float mi = (float) si / ti;
		System.out.println("---------------------------------");
		System.out.printf("\nVoce digitou " + tp + " numeros pares. E a media entre eles e %.2f" , mp);
		System.out.printf("\nVoce digitou " + ti + " numeros impares. E a media entre eles e %.2f" , mi);
	}

}
