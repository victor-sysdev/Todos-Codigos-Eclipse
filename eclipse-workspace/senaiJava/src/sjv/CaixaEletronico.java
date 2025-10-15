package sjv;
import java.util.Scanner;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		
		double saldoCliente = 1518.45;
		double adicionarValor;
		double sacar;
		int opicao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("=======Caixa Eletronico 24h ======");
		System.out.println("O que vc Deseja?");
		System.out.println("======Escolha a operção======");
		System.out.println("1 - Consultar saldo");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar ");
		System.out.println("4 - Sair");		
		opicao = entrada.nextInt();
		
		if(opicao == 1) {
			
			System.out.println("Seu saldo: " + saldoCliente);
			
		}else if(opicao == 2) {
			
			System.out.println("Adicione um valor: ");
			adicionarValor = entrada.nextDouble();
			System.out.println("Saldo atual: " + (adicionarValor + saldoCliente));
			
			
		}else if(opicao == 3) {
			
			System.out.println("Adicione um valor: ");
			sacar = entrada.nextDouble();
			
			if(sacar <= saldoCliente) {
				
				System.out.println("Saldo atual: " + ( sacar - saldoCliente));
				
			}else{
				
				System.out.println("Saldo Saldo insuficiente " );
				entrada.close();
				return;
				
			}
			
			
		}else if(opicao >= 4) {
			
			System.out.println("Obrigado pelo serviso " );
			entrada.close();

			
		}
		
		
	}

}
