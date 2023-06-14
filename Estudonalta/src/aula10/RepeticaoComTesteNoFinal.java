package aula10;

import java.util.Scanner;

public class RepeticaoComTesteNoFinal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0;
		String resp;
		
		do {
			System.out.println("Digite um Nº");
			n = leia.nextInt();
			
			System.out.println("'S' para continuar:");
			resp = leia.next();
			
		}while(resp == "s" || resp == "S");
		
		System.out.println("Fim do Codigo");
	}

}
