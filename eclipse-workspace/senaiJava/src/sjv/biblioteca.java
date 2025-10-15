package sjv;
import sjv.Livro;


public class biblioteca {
	
	
	public static void main(String[] args) {
		
	Livro livro = new Livro("logaritimos", "carlos andrade", "1999", "298", false, "5");
	Livro livro2 = new Livro("Álgebra Linear", "Maria Lima", "2005", "350", true, "6");
    Livro livro3 = new Livro("Cálculo I", "João Pereira", "2012", "420", false, "8");
	
    livro.exibir();
    livro2.exibir();
    livro3.exibir();	
		
		
	}

}
