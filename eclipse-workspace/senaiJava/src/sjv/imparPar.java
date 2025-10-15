package sjv;
import java.util.Scanner;

public class imparPar {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Digite um numero inteiro!");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			
			System.out.println("Esse numero e par!");
			
			
		}else {
			
			System.out.println("Essee numero e Impar");
			
		}
				
	}

}
