package sjv;

public class Finyou { //My class main
	
	 String finaceiro;
	 String rh;
	 String markenting;
	 String desenvolvedores;
	 String chefia;
	
	public Finyou(String finaceiro, String rh,String markenting, String Desenvolvedores,String chefia ){
		
		this.finaceiro = finaceiro;
		this.chefia = chefia;
		this.desenvolvedores = Desenvolvedores;
		this.finaceiro = finaceiro;
		this.markenting = markenting;
		this.rh = rh;
		
		
	}
	
	public void funcaoSetores(){
		
		System.out.print(this.desenvolvedores+":fazem a manutemção do site!\n");
		System.out.print(this.chefia +":coderna todo os setores!\n");
		System.out.print(this.finaceiro +": cuida do dinheiro!\n");
		System.out.print(this.markenting +":Cuida do markenting!\n");
		System.out.print(this.rh +": demite o povo !\n");
		
	}
	
	public void finaceiro( double divida, double faturamento ) {
		
		double lucro = divida - faturamento;
		System.out.println("Resultado: " + lucro);
		System.out.println("A culpa e do " + finaceiro);
		
		if(lucro >= 0) {
			
			System.out.println("Carlos demitido!");
	
			
		}else {
			
			System.out.println("Carlos promovido!");
			
		}
		
		
		
	}
	
}
