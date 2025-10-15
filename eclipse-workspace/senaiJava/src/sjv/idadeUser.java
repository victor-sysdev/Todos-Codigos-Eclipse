package sjv;
import java.util.Scanner;

public class idadeUser {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade ;
		int resultado = 2025;
		
		System.out.println("Digite a sua idade");
		idade = entrada.nextInt();
	
		System.out.print(resultado - idade);
		
		
		entrada.close();
		
		
	}

}
