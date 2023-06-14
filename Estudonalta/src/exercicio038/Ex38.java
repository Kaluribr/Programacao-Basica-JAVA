package exercicio038;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome, novoM = "", velhoM = "", novaF = "", velhaF = "";
		char sexo;
		int idade, c = 1, totM = 0, totF = 0;
		int maiorM = 0, maiorF = 0, menorM = 0, menorF = 0;
		
		while( c <= 5) {
			//ENTRADA DE DADOS
			System.out.println("----------------------");
			System.out.println(c + "°. PESSOA");
			System.out.println("----------------------");
			System.out.println("NOME:");
			leia.skip("\\R?"); // Pode estar errado
			nome = leia.nextLine();
			System.out.println("SEXO [M/F]: ");
			sexo = leia.next().charAt(0);
			System.out.println("IDADE: ");
			idade = leia.nextInt();
			
			// Análise de Dados
			if (sexo == 'M' || sexo == 'm') {
				totM ++;
				if( totM == 1) {
					maiorM = idade;
					velhoM = nome;
					menorM = idade;
					novoM = nome;
				} else {
					if (idade > maiorM) {
						maiorM = idade;
						velhoM = nome;
					}
					if (idade < menorM) {
						menorM = idade;
						novoM = nome;
					}
				}
			} else if(sexo == 'F' || sexo == 'f') {
				totF ++;
				if(totF == 1) {
					maiorF = idade;
					velhaF = nome;
					menorF = idade;
					novaF = nome;
				} else {
					if (idade > maiorF) {
						maiorF = idade;
						velhaF = nome;
					}
					if (idade < menorF) {
						menorF = idade;
						novaF = nome;
					}
				}
			}
			c ++;
		}
		//RESULTADO
		System.out.println("====================================================");
		System.out.println("Ao todo tivemos " + totM + " homens e " + totF + " mulheres cadastrados.");
		System.out.println("O homem mais jovem é " + novoM + " que tem " + menorM + " anos.");
		System.out.println("O homem mais velho é " + velhoM + " que tem " + maiorM + " anos.");
		System.out.println("A mulher mais jovem é " + novaF + " que tem " + menorF + " anos.");
		System.out.println("A mulher mais velha é " + velhaF + " que tem " + maiorF + " anos.");
		System.out.println("====================================================");

	}

}