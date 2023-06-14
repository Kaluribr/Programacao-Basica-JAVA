package exercicio037;

import java.util.Scanner;

public class Ex037 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome, novo = null, velho = null;
		int idade, c = 1, maior = 0, menor = 0;
		
		
		while(c <= 5) {
			// ENTRADA DE DADOS
			System.out.println("============================");
			System.out.println( c + "º PESSOA\n");
			System.out.println("============================");
			System.out.println("NOME: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			System.out.println("IDADE: ");
			idade = leia.nextInt();
			// ANALISE DE DADOS
			
			if(c == 1) {
				maior = idade;
				velho = nome;
				menor = idade;
				novo = nome;
			}else {
				if(idade > maior){
				maior = idade;
				velho = nome;
			}
				if(idade < menor) {
				menor = idade;
				novo = nome;
			}
		}
			c ++;
		}
		System.out.println("====================================");
		System.out.println("A pessoa mais jovem é " + novo + " com " + menor + " idade");
		System.out.println("A pessoa mais velha é " + velho + " com " + maior + " idade");
		System.out.println("====================================");
	}

}
