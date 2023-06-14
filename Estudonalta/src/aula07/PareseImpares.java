package aula07;

import java.util.Scanner;
import java.util.Formatter;

public class PareseImpares {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
 
		
		int num = 0, pares = 0, impares = 0, c = 1, sp = 0, si = 0;
		float mp = 0, mi=0;
		
 
	while(c <= 5) {
		System.out.println("Digite o " + c + "º valor");
		num = leia.nextInt();
	 
		if( num % 2 == 0 ) {
			pares ++;
			sp += num;
		}
		if(num % 2 != 0) {
			impares ++;
			si += num;
		}
		c++;
	}
	mp = sp / pares;
	mi = si / impares;
	System.out.println("----------------------------");
	System.out.printf("Voce digitou "+ pares + " numeros pares. A media e %.3f", mp);
	System.out.printf("\nVoce digitou "+ impares + " numeros impares. A media e %.3f", mi);
	}
}
	
