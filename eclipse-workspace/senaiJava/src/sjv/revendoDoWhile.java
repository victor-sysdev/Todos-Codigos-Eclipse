package sjv;
import java.util.Arrays;
import java.util.Scanner;

public class revendoDoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int  numero;
		int []  numero2 = {10, 12, 345, 56, 39, 120};

		
		do {
			System.out.println("Adivinhe o numero " +  Arrays.toString(numero2));
			numero = entrada.nextInt();
			
			if(numero != 120) {
				
				System.out.println("Voce digitou " + numero + " Tente de novo");
				
			}
			
		    }while (numero != 120);
			
			System.out.println("Programa encerrado!");
			entrada.close();
			
			}
		
	}

