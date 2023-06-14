package aula06;

import java.util.Scanner;

public class MaiorEMenorValor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int maior = 0, menor =0, num, c = 1;
		
		while(c<=4) {
			System.out.println("Digite o "+ c +"° numero");
			num = leia.nextInt();
			
			if(c == 1) {
				maior = num;
				menor = num;
			}else {
				if(num < menor) {
					menor = num;
				}
				if(num > maior) {
					maior = num;
				}
			}
			c ++;
		}
		System.out.println("O maior valor foi " + maior);
		System.out.println("O menor valor foi " + menor);
	}

}
