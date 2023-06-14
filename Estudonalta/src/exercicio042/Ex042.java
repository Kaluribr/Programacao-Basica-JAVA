package exercicio042;

import java.util.Scanner;

public class Ex042 {
	/*Faça um programa que leia NOME, SEXO  e  SALÁRIO de vários funcionários.
	O programa também deve perguntar se o usuário deve ou não continuar o cadastro. No final, analise os dados e mostre:
		- Total de funcionário cadastrados
		- Total de homens
		- Total de mulheres
		- Média salarial dos homens
		- Total de mulheres que ganham mais de R$1.000,00
		- Maior salário entre os homens
	*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char sexo, resp;
		double sal, somaSalH = 0.0, medSalH = 0, salM = 0.0;
		int tot = 0, totH = 0, totM = 0, totMil = 0;
		
		while(true) {
			System.out.println("NOME: ");
			nome = leia.next();
			System.out.println("SEXO [M/F]:");
			sexo = leia.next().charAt(0);
			System.out.println("SALÁRIO: R$");
			sal = leia.nextDouble();
			tot ++;
			if(sexo == 'M' || sexo == 'm') {
				totH++;
				somaSalH += sal;
				if(totH == 1) {
					salM = sal;
				} else {
					if(sal > salM) {
						salM = sal;
					}
				}
			}else if( sexo == 'F' || sexo == 'f') {
				totM++;
				if (sal > 1000) {
					totMil++;
				}
			}
			
			System.out.println("Quer continuar? [S/N] ");
			resp = leia.next().charAt(0);
			if(resp == 'n' || resp == 'N') {
				break;
			}
			System.out.println("-------------------------------");
		}
		medSalH = somaSalH / (double)totH;
		System.out.println("========= RESULTADO ==========");
		System.out.println("Total de funcionários cadastrados: " + tot);
		System.out.println("Total de Homens: " + totH);
		System.out.println("Total de Mulheres: " + totM);
		System.out.println("A média salarial dos Homens é R$" + medSalH);
		System.out.println("Temo " + totMil + " mulheres ganhando mais de R$1000.");
		System.out.println("O maior salário entre os homens é R$:" + salM);
	}
	
}
