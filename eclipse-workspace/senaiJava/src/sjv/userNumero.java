package sjv;
import java.util.Scanner;

public class userNumero {
	
	public static void main(String[] args) {
		
		
		String nome;
		String possitivo;
		double numeros = 0;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome!");
		nome = entrada.nextLine();
		
		for(int i = 1; i < 4; i++) {	
			System.out.println("Digite " + i + " Numero");
				numeros = entrada.nextDouble();	
				contador += numeros;
		
		}
		
		double multiplicação = contador*numeros;
		
		System.out.println("Para multiplicação o valor digite sim");
		possitivo = entrada.next();
		
		if(possitivo.equals("sim")) {
			
			System.out.println("O resultado " + nome + " é " + multiplicação);
	
		}else{
			
			System.out.println( nome + ", Voce e muito sem graça!!");
			System.out.println("Fim!");
			
		}
		
		
		entrada.close();
		
		}
	
	
}
