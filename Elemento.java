import java.util.ArrayList;

public class Elemento {
	
	
	private int idade, id;
	private String nome;
	private ArrayList <Elemento> filhos;
	
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
	
	
	public ArrayList <Elemento> getFilhos() {
		return filhos;
	}
	public void setFilhos(ArrayList <Elemento> filhos) {
		this.filhos = filhos;
	}
	
	
	
	
	
	
	
	// Construtor
	public Elemento (int idElemento,int idadeElemento, String nomeElemento) {
	
		this.nome = nomeElemento;
		this.idade = idadeElemento;
		this.id = idElemento;
	}
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	    
	 
	

}
