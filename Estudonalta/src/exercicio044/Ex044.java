package exercicio044;

import java.util.Random;
import java.util.Scanner;

public class Ex044 {
	
	public static void main(String[] args) {
		/*Ex44 Escreva um programa que sorteie vários números entre 1 e 10 e pergunte a cada iteração se o usuário quer continuar. No fim, mostre na tela:
		- Quantos valores foram sorteados
		- A soma de todos eles
		- Qual foi o maior e o menor valor sorteado
		- Quantas vezes o número 5 foi sorteado
		Autor: Danilo Moraes 
		Empresa: SevemDev */ 
		
		Scanner leia = new Scanner(System.in);
		Random ran = new Random();
		
		int n, tot = 0, s = 0, mai = 0, men = 0, cont5 = 0;
		char resp = ' ';
		
		do {	
			n = ran.nextInt(1, 10+1);
			tot++;
			s += n;
			if(tot == 1) {
				mai = n;
				men = n;
			} else {
				if (n > mai) mai = n;
				if (n < men) men = n;
				
			}
			
			if(n == 5) {
				cont5 ++;
			}
			System.out.println("O " + tot + "°. valor sorteado foi " + n);
			
			System.out.println("Quer continuar? [S/N] ");
			resp = leia.next().charAt(0);
		}while(resp != 'n' && resp != 'N');
		System.out.println("================== RESULTATO ==================");
		System.out.println("Ao todo foram sorteados " + tot + " valores.");
		System.out.println("A soma de todos os números sorteados foi " + s);
		System.out.println("O maior valor foi " + mai + " e o menor foi " + men);
		System.out.println("O valor 5 foi sorteado " + cont5 + " vezes.");
		System.out.println("-----------------------------------------------");
		
		
		
	}
}
