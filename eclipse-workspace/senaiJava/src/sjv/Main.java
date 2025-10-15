package sjv;
import sjv.Finyou;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double divida;
		double faturamento;
		System.out.println("===== Apresentação ======");
		Finyou finyou1 = new Finyou("Carlos", "Maria", "Rodrigo", "Tito", "Kaio");
		finyou1.funcaoSetores();
		
		System.out.println("Digite a divida da Finyou: ");
		divida = sc.nextDouble();
		System.out.println("Digite o lucro da Finyou: ");
		faturamento = sc.nextDouble();
		
		finyou1.finaceiro(divida, faturamento);
		
	}
			
		
		
}
