package sjv;
import java.util.Scanner;

public class CauculadoraDoWhile {
			
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int numero2 = 0;
		int opicao = 0;
		
		do {
			
			System.out.println("=======Caculadora======");
			System.out.println("Escolha dois 0 para finalizar o programa e digite qualquer operação!");
			System.out.println("Digete um numero ");
			
			numero = entrada.nextInt();
			System.out.println("Digete outro numero ");
			numero2 = entrada.nextInt();
			System.out.println("======Escolha a operção======");
			System.out.println("1 - soma");
			System.out.println("2 - subtração");
			System.out.println("3 - multiplição ");
			System.out.println("4 - Divisão");		
			opicao = entrada.nextInt();
			
			if(opicao == 1){
				
				System.out.println("Resultado da soma: " + (numero + numero2));
				
			}else if(opicao == 2) {
				
				System.out.println("Resultado da subtração: " + (numero - numero2) );
				
			}else if(opicao == 3) {
				
				System.out.println("Resultado da multiplicação: " + (numero * numero2));
				
			}else if(opicao == 4) {
				
				System.out.println("Resultado da Divisão: " + (numero / numero2));
				
			}else {
				
				System.out.println("Faz o trem direito!");
				entrada.close();
				break;
			}
			
		}while(numero != 0);	
		
		System.out.println("Fim!");
		entrada.close();
		
	}
	
}
