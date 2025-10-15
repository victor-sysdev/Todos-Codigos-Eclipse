package sjv;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		System.out.println("======= Tabuada do 4 ======");
		
		int numero = 0;
		int tabuada = 0;
		
		
		
		System.out.println("Digite um numero!");
		
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		
		tabuada = 4 * numero;
		
		System.out.println(tabuada);
		
	}
	
}
