package sjv;
import java.util.Scanner;

public class escolhaTabuada {
	
	public static void main(String[] args) {
		
		System.out.println("====== Tabuada ======");
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int resultado;
		
		System.out.println("Digite um numero!");
		numero = entrada.nextInt();
		
		for(int i = 0; i < 11; i++) {
			resultado = numero * i;
			System.out.println(numero + "X" + i + "=" + resultado );
			
		}
		
		
		
	}
	

}
