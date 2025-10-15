package sjv;

public class Escola {
	
	
	String nomeEscola;
	String localizacao;
	double Cep;
	int avaliacao;
	boolean publica;
	
	public void informacao(String nomeEscola,String localizacao,int avaliacao,boolean publica) {
		
		this.nomeEscola = nomeEscola;
		this.localizacao = localizacao;
		this.avaliacao = avaliacao;
		this.publica = publica;
		
		
	}
	
	public String getnomeEscola() {
		return nomeEscola;
			
	}
	public String getlocalizacao() {
		return localizacao;
			
	}
	public  int getavaliacao() {
		return avaliacao;
			
	}
	public boolean getpublica() {
		return publica;
			
	}
	
	public void gettudo() {
		
		System.out.println("=== Avalição escolar ===\n");
		System.out.println("Nome da escola: " + nomeEscola);
		System.out.println("Localização da escola: " + localizacao);
		System.out.println("Avaliação: " + avaliacao);
		System.out.println("Publica ou partivular " + publica + "\n");
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		Escola escola1 = new Escola();
		escola1.avaliacao = 10;
		escola1.nomeEscola = "Machado de Clention";
		escola1.Cep = 1223445;
		escola1.publica = true;
		
		Escola escola2 = new Escola();
		escola2.avaliacao = 8;
		escola2.nomeEscola = "Rei Pele";
		escola2.Cep = 32413;
		escola2.publica = true;
		
		Escola escola3 = new Escola();
		escola3.avaliacao = 2;
		escola3.nomeEscola = "Carlos andrade";
		escola3.Cep = 12443523;
		escola3.publica = true;
		
		Escola escola4 = new Escola();
		escola4.avaliacao = 5;
		escola4.nomeEscola = "nilton santos";
		escola4.Cep = 245345;
		escola4.publica = true;
		
		
		
		System.out.println("|n---|n");
		
		escola1.gettudo();
		escola2.gettudo();
		escola3.gettudo();
		escola4.gettudo();
		
		
		
		
		
	}
	
	
}
