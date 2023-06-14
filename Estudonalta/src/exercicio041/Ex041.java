package exercicio041;

import java.util.Scanner;

public class Ex041 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome = "", velho = "", novo = "";
		int idade = 0, totA = 0, soma = 0, maior = 0, menor = 0;
		double media = 0.0;
		
		while(true) {
			System.out.println("------------ NOVO AMIGO -------------");
			System.out.println("OBS: Digite ACABOU no nome para parar");
			System.out.println("NOME: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			if(nome.equalsIgnoreCase("acabou")) {
				break;
			}
			System.out.println("IDADE: ");
			idade = leia.nextInt();
			//Analizando os Dados
			totA ++;
			soma += idade;
			
			if(totA == 1) {
				maior = idade;
				velho = nome;
				menor = idade;
				novo = nome;
			} else {
				if(idade < menor) {
					menor = idade;
					novo = nome;
				}
				if(idade > maior) {
					maior = idade;
					velho = nome;
				}
			}
		}
		media = (double)soma / (double)totA;
		System.out.println("************ INTERROMPIDO *************");
		System.out.println("============ RESILTADO ================");
		System.out.println("Total de amigos: " + totA);
		System.out.printf("A média das idades " + media);
		System.out.println("\nSeu amigo mais jovem é " + novo + " com " + menor +  " anos.");
		System.out.println("Seu amigo mais velho é " + velho + " com " + maior + " anos.");
	}

}
