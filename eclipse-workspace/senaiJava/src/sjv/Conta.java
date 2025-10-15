package sjv;
import java.util.Scanner;
public class Conta{
		
		
		String numeroConta;
		String titular;
		String senha;
		double deposita;
		double sacar;
		double consutarSaldo;
		boolean verificarSenha(String SenhaDigitada) {
			
			if(senha.equals(SenhaDigitada)) {
				return true;	
			}else {
				
				return false;
			}
			
		}
		
		void consutarSaldo() {
			
			System.out.println("Saldo: R$ " + consutarSaldo);
			
		}
		
		void deposita(double valor) {
			
			if(valor > 0) {
				consutarSaldo += valor;
				System.out.println("Deposito realizado com sucesso!");
				System.out.println("Saldo: R$ " + (consutarSaldo + valor));
			}else {
				
				System.out.println("Erro: Valor invalido!");
				System.out.println("Saldo: R$ " + consutarSaldo);
				
			}
			
			
		}
		
		void sacar(double valor) {
			
			if(valor > 0 && consutarSaldo >=valor ){
				consutarSaldo -= sacar;
				 System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
				 consutarSaldo();
				
			}else {
				
				System.out.println("Erro: Valor invalido!");
				 consutarSaldo();
				
			
			}
			
				
			}
			
		  public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int opicao;
		        int tentativas = 3;

		        Conta contaVictor = new Conta();
		        contaVictor.numeroConta = "145778";
		        contaVictor.senha = "12345";
		        contaVictor.titular = "Victor";
		        contaVictor.consutarSaldo = 1000.0; 

		       String senhaDigitada = "";		        
		        
		       while(tentativas > 0) {
		    	   
		    	   System.out.print("Digite a senha: ");
		    	   senhaDigitada = sc.nextLine();
		    	   
		    	   if(!contaVictor.verificarSenha(senhaDigitada)) {
		    		   tentativas--; 
		    		   System.out.println("Senha incorreta! Tentativas: " + tentativas);
		    		 
		    		
		    		   
		    	   }else {
		    		  
		    		   break;
		    		   
		    	   }
		    	   
		    	   }
		    	   
		       
		       if(!contaVictor.verificarSenha(senhaDigitada)) {
		    	   System.out.println("Bloqueado!");
		    	   sc.close();
		    	   return;
		    	   
		       }
			  
		    	   
		    	 System.out.println("Senha correta!");
		    	 System.out.println("Bem-Vindo!" + contaVictor.titular);
		    	 
		    	 boolean continuar = true;
		    	 while(continuar) {
		    		 

		    			System.out.println("======= MENU ======");
		    			System.out.println("O que vc Deseja?");
		    			System.out.println("1 - Consultar saldo");
		    			System.out.println("2 - Depositar");
		    			System.out.println("3 - Sacar ");
		    			System.out.println("4 - Sair");		
		    			System.out.println("======Escolha a operção======");
		    			opicao = sc.nextInt();
		    			
		    			
		    			if(opicao == 1) {
		    				
		    				contaVictor.consutarSaldo();
		    				sc.close();
		    				break;
		    				
		    			}else if(opicao == 2) {
		    				
		    				System.out.println("Digite o valor do deposito!");
		    				double valorDeposito = sc.nextDouble();
		    				contaVictor.deposita(valorDeposito);
		    				sc.close();
		    				break;
		    				
		    			}else if(opicao == 3) {
		    				
		    				System.out.println("Digite o valor que voce quer sacar!");
		    				double valorSacar = sc.nextDouble();
		    				contaVictor.sacar(valorSacar);
		    				sc.close();
		    				break;
		    				
		    			}else if(opicao >= 4) {
		    				
		    				System.out.println("Saindo...");
		    				break;
		    				
		    			}
		    			
		    			sc.close();
		    		 
		    		 
		    	 }
		       

		
		    }

	}
	

	
		



	
