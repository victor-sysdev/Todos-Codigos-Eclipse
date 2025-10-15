package sjv;
import java.util.Scanner;

public class ValidacaoSenha {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String 	senhaCorreta ="java123";
		String 	senha = "";
		int tentativas = 0;
			
			while(tentativas < 3){
				
				System.out.println("Digite a senha!");
				senha = entrada.nextLine();
				
				if(senha.equals(senhaCorreta)) {
					
					System.out.println("Acesso Liberado");
					entrada.close();
					return;
					
				}else {
					
					System.out.println("Senha incorreta, tenete novamente!");
					tentativas++;
				}
				
		}

			System.out.println("Digite Sim para redefinir senha! ou nao pata fechar o programa!	");
			String resposta = entrada.nextLine();
			
			if(resposta.equals("sim")) {
				System.out.println("Digite uma nova senha!");
				senhaCorreta = entrada.nextLine();
				System.out.println("Senha definida com sucesso!");
				
				
			}else {
				
				System.out.println("Fim");
				
			}
			
			
			System.out.println("Acesso liberado");
			entrada.close();
		}
}

