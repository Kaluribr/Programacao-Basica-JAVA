package exercicio035;

import java.util.Scanner;

public class Ex035 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		int tot;
		float ref;
		System.out.println("Quantas pessoas vamos cadastrar? ");
		tot = leia.nextInt();
		
		System.out.println("Qual será o peso referência? (Kg) ");
		ref = leia.nextFloat();
		
		int c = 1, toth = 0, totm = 0;
		float peso;
		char sexo;
		while(c <= tot) {
			System.out.println("---------------------------");
			System.out.println("\n PESSOA " + c + " de " + tot);
			System.out.println("---------------------------");
			System.out.println("Peso: (KG) ");
			peso = leia.nextFloat();
			System.out.println("Sexo: [M/F] ");
			sexo = leia.next().charAt(0);
				
			if(peso <= ref) {
				System.out.print("=== PESO DENTRO DO LIMITE ===\n");
				}else {
					System.out.println("=== PESO ACIMA DO LIMITE ===\n");
					if(sexo == 'M' || sexo == 'm') {
						toth ++;
					}if(sexo == 'f' || sexo == 'F'){
						totm ++;
					}
				}
			
			c++;
		}
		System.out.println("-----------RESULTADO------------");
		System.out.println("\nAo todo, temos " + toth + " homens acima do peso de referencia");
		System.out.println("\ne " + totm + " mulheres acima do peso de referencia! ");
	}
}
