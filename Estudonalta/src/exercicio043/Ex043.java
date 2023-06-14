package exercicio043;

import java.util.Scanner;

public class Ex043 {

	/*Ex41: Escreva um programa que leia vários números usando a estrutura FAÇA..ENQUANTO. No final, mostre:
	- Quantos valores foram digitados
	- Quantos valores pares foram digitados
	- Qual foi o menor valor ímpar digitado
	Autor: Danilo Moraes 
	Empresa: SevemDev */
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n, tot = 0, totPar = 0, totImp = 0, menorImp = 0;
		char resp = ' ';
		
		do {
			System.out.println("Digite o " + (tot+1) + " o. número: ");
			n = leia.nextInt();
			
			tot++;
			
			if(n % 2 == 0) {
				totPar++;
			} else {
				totImp ++;
				
				if( totImp == 1) {
					menorImp = n;
				}else {
					if ( n < menorImp ) {
						menorImp = n;
					}
				}
			}
			
			System.out.println("Quer continuar? ");
			resp = leia.next().charAt(0);
		} while(resp != 'N' && resp != 'n' );
		System.out.println("\n========= RESULTADOS =========");
		System.out.println("Ao todo você digitou " + tot + " números.");
		System.out.println("Você digitou " + totPar + " números PARES.");
		System.out.println("O menor valor ÍMPAR digitado foi " + menorImp);
		System.out.println("---------------------------------");
	}

}
