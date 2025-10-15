package sjv;
import java.util.Scanner;

public class diasSemana {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		numero = entrada.nextInt();
		
		System.out.println("Digite um numero equivalente a um dia da semana!");
		
		if(numero == 1) {
			
			System.out.println("Domingo");
			
		}else if(numero == 2){
			
			System.out.println("Segunda");
			
			
		}else if(numero == 3){
			
			System.out.println("Terça");
			
		}else if(numero == 4){
			
			System.out.println("Quarta");
		
		}else if(numero == 5) {
			
			System.out.println("Quinta");
			
		}else if(numero == 6){
			
			
			System.out.println("Sexta");
			
			
		}else if(numero == 7) {
			
			System.out.println("Sabado");
			
		}else {
			
			System.out.println("Invalido");
		}
			
			
	}

}
