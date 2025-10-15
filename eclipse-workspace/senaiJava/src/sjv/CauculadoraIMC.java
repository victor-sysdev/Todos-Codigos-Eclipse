package sjv;
import java.util.Scanner;

public class CauculadoraIMC {
	
	public static void main(String[] args) {
		
		
		int idade;
		double altura;
		double peso;
		String nome;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("=====BEM-VINDO======");
		System.out.println("====Calculadora IMC======");
		System.out.println("Digite o seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		System.out.println("Digite sua altura");
		altura = entrada.nextDouble();
		System.out.println("Digite o seu peso");
		peso = entrada.nextDouble();
		
		double imc = peso / (altura + altura);
		
		System.out.printf("IMC: %.2f\n" , imc);
		
		if(imc < 18.5) {
			
			System.out.println("Classificação: Abaixo do peso");
			
		}else if(imc < 25) {
			
			System.out.println("Classificação: Peso normal");
			
		}else if(imc < 30) {
			
			System.out.println("Classificação: Sobrepeso");
			
		}else {
			
			System.out.println("Classificação: Obesidade");
			
		}
		
	}

}
