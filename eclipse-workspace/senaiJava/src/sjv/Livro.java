package sjv;

public class Livro {
	
	
	private String titulo;
	private String autor;
	private String  anoPublicado;
	private String quantidadePaginas;
	private String  caucularTempoLeitura;
	private boolean emprestimo;
	
	public Livro(String titulo,String autor,String  anoPublicado,String quantidadePaginas, boolean emprestimo, String  caucularTempoLeitura) {
		
		this.anoPublicado = anoPublicado;
		this.autor = autor;
		this.titulo = titulo;
		this.caucularTempoLeitura = caucularTempoLeitura;
		this.quantidadePaginas = quantidadePaginas;
		this.emprestimo = emprestimo;
		
	}
	
	public String getTitulo() {
		return titulo;
		
	}
	
	public String getAutor() {
		return autor;
		
	}
	public String getAnoPublicado() {
		return anoPublicado;
		
		
	}
	
	public String getQuantidadePaginas() {
		return quantidadePaginas;
		
		
	}
	
	public boolean getEmprestimo() {
		return emprestimo;
		
	}
	
	public String getTempoLeitura() {
		return caucularTempoLeitura;
		
	}

	public void emprestimo() {
		
		if(!emprestimo) {	
			emprestimo = true;
			System.out.println(titulo + "foi emprestado");
			
		}else {
			
			System.out.println(titulo + "não está emprestado");
			
			
		}
		
	
		
	}
	
	public void exibir() {
	
		System.out.println("=== Livro ===");
		System.out.println("Titulo: " + getTitulo());
		System.out.println("autor: " + getAutor());
		System.out.println("Ano: " + getAnoPublicado());
		System.out.println("Paginas: " + getQuantidadePaginas());
		System.out.println("Emprestimo: " + getEmprestimo());
		
	}
	
}

	
	
	
	




















