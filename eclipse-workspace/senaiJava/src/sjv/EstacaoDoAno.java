package sjv;
import java.util.Scanner;

public class EstacaoDoAno {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mes;
		
		System.out.println("Exemplo de meses: \n");
		System.out.println("janeiro		fevereiro		Março	abril	\r\n"
				+ "	Maio	Junho		Julho		agosto	setembro		Outubro		novembro	\r\n"
				+ "dezembro");
		
		System.out.println("Digite um Mes!");
		mes = sc.nextLine();
		
	switch (mes) {
		
	case "Janeiro":
	case "Fevereiro":
	case "Março":
		System.out.println("Estação desse Mes: " + mes + "Verão");
		break;
	case "Maio":
	case "Junho":
	case "Julho":
		System.out.println("Estação desse Mes: " + mes + "Outono");
		break;
	case "Agosto":
	case "Setembro":
		System.out.println("Estação desse Mes: " + mes + "Inverno");
		break;
	case "Outubro":
	case "Novembro":
	case "Dezembro":
		System.out.println("Estação desse Mes: " + mes + "Primavera");
		break;
	default:
		System.out.println("Mes desconhecido");
		sc.close();
	
	}
		
	}

}
