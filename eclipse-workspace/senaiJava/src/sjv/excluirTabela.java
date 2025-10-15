package sjv;
import java.util.Scanner;

public class excluirTabela {
		public static void main(String[] args) {
			
			int numeroLista = 0;
			try (Scanner entrada = new Scanner(System.in)) {
				System.out.println("Digite o numero que quer excluir tabela de 1 a 10 ");
				numeroLista = entrada.nextInt();
			}
			
			for(int l = 0; l <= 10; l++){	// Linha 
				for(int c = 0; c <= 9; c++){ // coluna
					
					if(c == numeroLista) {
						
						System.out.print(" ");
						
					}else {
						
						System.out.print( c + " ");
						
					}
					
				} if(l == numeroLista){
						
					System.out.println( " ");
			}else {
				
				System.out.println(l + " ");
			}
			
			}
		}
}
