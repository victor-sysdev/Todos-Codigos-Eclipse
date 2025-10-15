package sjv;
import java.util.Scanner;

public class CorecaoCaixa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldoConta = 1518.45;
		int opicao;
		
		System.out.println("====BEM-VINDO AO CAIXA ELETRONICO====");
		
			
			System.out.println("\n --- MENU PRINCIPAL ---");
			System.out.println("1. Consultar saldo ");
			System.out.println("2. Depositar");
			System.out.println("3. Sacar");
			System.out.println("4. Sair");
			System.out.println("---Escolha uma opição---:");
			opicao = sc.nextInt();
		
			do {
				
				
				
				switch (opicao) {
				
					case 1: 
					System.out.println("Seu saldo atual e : R$ " + saldoConta);
					break;
					case 2: 
					double deposito = 0;
					System.out.println("Seu saldo atual e : R$ " + saldoConta);
					System.out.println("Digite o valor que deseja depositar! " );
					deposito = sc.nextDouble();
					if (deposito > 0) {
						saldoConta += deposito;
						System.out.println("Deposito realizado com o sucesso: R$ " + saldoConta);	
					}else {
						
						System.out.println("Erro: valor do deposito invalido");
						
					}
					break;
					case 3: 
					double sacar;
					System.out.println("Digite o valor que deseja depositar: ");
					sacar = sc.nextDouble();
					if(sacar <= saldoConta) {
						saldoConta -= sacar;
						System.out.println("Saque realizado com o sucesso: R$ " + sacar);
						System.out.println("Seu saldo atual e : R$ " + saldoConta);
						
					}else {
						
						System.out.println("Erro: voce não tem saldo suficiente");
						
					}
					break;	
					
				}
				
				
				}while (opicao == 4);
				System.out.println("Obrigado por escolhor nosso serviço");
				sc.close();
			}
			
			
	}
				
				
				
				
				
			

