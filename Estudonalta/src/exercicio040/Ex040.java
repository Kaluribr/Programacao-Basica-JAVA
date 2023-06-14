package exercicio040;

import java.util.Scanner;

public class Ex040 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1, n2, opc = 0, resp;
		
		System.out.println("Operando 1: ");
		n1 = leia.nextInt();
		System.out.println("Operando 2: ");
		n2 = leia.nextInt();
		
		while(opc != 5) {
			System.out.println("\n====== ESCOLHA UMA OPERAÇÃO ======");
			System.out.println("[ 1 ] - Adição");
			System.out.println("[ 2 ] - Subtração");
			System.out.println("[ 3 ] - Multiplicação");
			System.out.println("[ 4 ] - Entrar com novos dados");
			System.out.println("[ 5 ] - Sair");
			System.out.println("\n>>>>>> SUA OPÇÃO: ");
			opc = leia.nextInt();
			
			switch (opc) {
			case 1: // Adição
				resp = n1 + n2;
				System.out.println("-------------------------");
				System.out.println("Calculando " + n1 + " + " + n2 + " = " + resp);
				System.out.println("-------------------------");
				break;
			case 2: // Subtração
				resp = n1 - n2;
				System.out.println("-------------------------");
				System.out.println("Calculando " + n1 + " - " + n2 + " = " + resp);
				System.out.println("-------------------------");
				break;
			case 3: // Multiplicação
				resp = n1 * n2;
				System.out.println("-------------------------");
				System.out.println("Calculando " + n1 + " * " + n2 + " = " + resp);
				System.out.println("-------------------------");
				break;
			case 4: // Entrada com novos dados
				System.out.println("Operando 1: ");
				n1 = leia.nextInt();
				System.out.println("Operando 2: ");
				n2 = leia.nextInt();
				break;
			case 5: // Sair
				System.out.println("\n=========== SAINDO ============");
				break;
			default: // Opção diferente
				System.out.println("\n=========== OPÇÃO INVÁLIDA ============");
				break;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("======== VOLTE SEMPRE =========");
	}
	
}
