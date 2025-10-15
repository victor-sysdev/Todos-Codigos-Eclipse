package sjv;
import java.util.Scanner;

public class VerificadorSenha {
	
	public static void main(String[] args) {
		
		int senha ;
		String user ;
		
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 =new Scanner(System.in);
		
		System.out.println("Digite usuario");
		user = entrada2.nextLine();
		System.out.println("Digite sua senha");
		senha = entrada.nextInt();
		
		if(senha == 12345 && user == "Admin") {
			
			System.out.println("Pode passar!");
			
		}else {
			
			System.out.println("Senha icorreta ou usuario icorreto!");
		}
		
		
		
		
	}

}
