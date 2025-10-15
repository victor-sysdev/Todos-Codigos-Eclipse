package sjv;
import java.util.Scanner;

public class notasAluno {
		
	public static void main(String[] args) {
		
		int quantidadeDeNota = 0;
		double notas = 0;
		double total = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		for(int i = 1; i < 4; i++) {
			 
			System.out.println("Digite a sua " + i + " Nota:"); 
				notas = entrada.nextDouble();
				total += notas;
				quantidadeDeNota++;
				
		}
		
		double media = notas /quantidadeDeNota; 
		System.out.println("media:" + media);
		entrada.close();
		
	}
	

}
