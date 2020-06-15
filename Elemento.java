

import java.util.ArrayList;

public class Elemento {
	
	
	private int idade, id;
	private String nome;
	private Elemento raiz;
	private ArrayList <Elemento> filhos;
	private int numFilhos;
	private ArrayList <Elemento> netos;
	private int numNetos;
	
	// Acessores
	
	public Elemento getRaiz() {
		return raiz;
	}
	
	public void setRaiz(Elemento raiz) {
		this.raiz = raiz;
	}
	
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
	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}
	
	public ArrayList <Elemento> getNetos() {
		return netos;
	}
	public void setNetos(ArrayList <Elemento> netos) {
		this.netos = netos;
	}
	public void setNumNetos(int numNetos) {
		this.numNetos = numNetos;
	}
	
	
	// Construtor
	public Elemento (int idadeElemento, String nomeElemento) {
	
		this.nome = nomeElemento;
		this.idade = idadeElemento;
		
	}
	
	public Elemento () {
		
	}
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	public Elemento getElementoFilhos(int id){
	    return getElementoRecursiveFilhos(raiz,id);
	}
	Elemento getElementoRecursiveFilhos(Elemento elemento, int indexDoArrayListFilho){
	    if(elemento.getId() == id) return elemento;
	    for(Elemento filho : elemento.getFilhos()){
	        Elemento temp = getElementoRecursiveFilhos(filho,indexDoArrayListFilho);
	        if(temp != null && temp.getId() == indexDoArrayListFilho) return filho;
	    }
	    return null;
	}
	
	public Elemento getElementoNetos(int id) {
		return getElementoRecursiveNetos(raiz, id);
	}
	private Elemento getElementoRecursiveNetos(Elemento elemento, int indexDoArrayListNeto){
	    if(elemento.getId() == id) return elemento;
	    for(Elemento netos : elemento.getNetos()){
	        Elemento temp = getElementoRecursiveNetos(netos,indexDoArrayListNeto);
	        if(temp != null && temp.getId() == indexDoArrayListNeto) return netos;
	    }
	    return null;
	}
}

