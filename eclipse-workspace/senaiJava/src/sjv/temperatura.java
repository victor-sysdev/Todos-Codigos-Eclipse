package sjv;
import java.util.Scanner;

public class temperatura {
		
	public static void main(String[] args) {
		
		double temperetura = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura de hoje!");
			temperetura = entrada.nextDouble();
			
		if(temperetura >= 30) {
			
			System.out.println("Estar quente!");
		
		}else if(temperetura >= 20){
			
			System.out.println("Temperatura agradavel");
			
		}else{
			
			System.out.println("estar frio!");
			
		}
		
		entrada.close();
		
	}
	
}
