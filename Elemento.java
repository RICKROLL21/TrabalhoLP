public class Elemento {
	
	
	private int idade, id;
	private String nome;
	private Elemento elemento;
	private Elemento esq;
	private Elemento dir;
	
	// Acessores
	
	public int getIdade() {
        return idade;
    }	
	public void setIdade(int idade) {
	        this.idade = idade;
	}
	
	
	public int getId() {
        return id;
    } 
	public void setId(int id) {
	        this.id = id;
	}
	
	
	public String getNome() {
        return nome;
    }   
	public void setNome(String nome) {
	        this.nome = nome;
	}
	
	
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	

	public Elemento getEsq() {
		return esq;
	}
	public void setEsq(Elemento esq) {
		this.esq = esq;
	}

	
	public Elemento getDir() {
		return dir;
	}
	public void setDir(Elemento dir) {
		this.dir = dir;
	}
	
	
	
	
	// Construtor
	public Elemento (int idElemento,int idadeElemento, String nomeElemento) {
	
		this.nome = nomeElemento;
		this.idade = idadeElemento;
		this.id = idElemento;
	}
	
	public Elemento(Elemento elemento) {

		this.elemento = elemento;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}
	    
	 
	

}
