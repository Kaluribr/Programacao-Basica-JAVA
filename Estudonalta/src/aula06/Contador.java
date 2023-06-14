package aula06;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int c = 0, meninos =0 , meninas =0;
		
		String sx;
		
		while(c <= 4) {
			System.out.println("Digite o sexo: [M/F] ");
			sx = leia.nextLine();
			if (sx.equals("M") || sx.equals("m") || sx.equals("homem") )   {
				meninos++;
			}if (sx.equals("F") || sx.equals("f") || sx.equals("mulher") ) {
				meninas++ ;
			} 
			c++;
			
		} 
		System.out.println("O total de meninos e " + meninos);
		System.out.println("\nO total de meninas e " + meninas);
	}

}
