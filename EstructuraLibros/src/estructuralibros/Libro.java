
package estructuralibros;

public class Libro {
	private  String titulo;
	private  String autor;
	private  String isbn;
        
        
        
        
	public Libro(String titulo, String autor, String isbn) {
		this.titulo=titulo;
		this.autor=autor;
		this.isbn=isbn;
	}
	public String getTitulo( String titulo ) {
		return titulo;
	}
	public void setTitulo() {
		this.titulo=titulo;               
	}
	public String getAutor(String autor) {
		return autor;	
	}
	public void setAutor() {
		this.autor=autor;
            
	}
	public String getIsbn( String isbn ) {
		return isbn;
	}
	public void setIsbn() {
		this.isbn=isbn;
            
	} 
    }
