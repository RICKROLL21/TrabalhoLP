import java.util.Stack;
import java.util.ArrayList;

	public class Arvore implements ArvoreNAry {


	    private int valor;
	    
	    

	    private ArrayList <Elemento> filhos;

	    

	    public int getValor() {
	        return valor;
	    }
	    public void setValor(int valor) {
	        this.valor = valor;
	    }
	    
	    

	    public ArrayList<Elemento> getFilhos() {
	        return filhos;
	    }
	    
	    
	    
	    public void addFilho (Elemento filho) {
	        filhos.add(0,filho);
	    }

	    
	    
	public void removeFilho (Elemento filho) {

	        filhos.remove(filho);

	    }



	public void removeindex (int filho) {

	    filhos.remove(filho);

	}


	public void Elemento (int valor) {

	    this.valor = valor;

	    filhos  = new ArrayList();

	}
		
		
		
	    // Implementar a Interface GeralTree
	    private Arvore raiz;
	    private int tamanho;

	    @Override
	    public Arvore inserir( int num ) {
	        if ( raiz != null) 	
	            throw new IllegalStateException();

	        raiz = new Arvore(num);
	        tamanho = 1; 
	        
	        return raiz;
	        }
	        
	        
	    @Override
	    public Arvore inserir( int num, Arvore pai ) {
	        if ( pai == null) 
	            throw new NullPointerException();
	        
	        Arvore temporario = new Arvore(num);
	        pai.addFilho(temporario);
	        tamanho ++; 

	        return temporario;
	    }

		public int[] preOrder() {
			int[] nos = new int[tamanho];

	        Stack<Elemento> nosVisitar = new Stack<>();
	        nosVisitar.push(raiz);

	        int i = 0;
	        while (!nosVisitar.empty()) {
	        	Elemento no = nosVisitar.pop();
	            if (no == null)
	                continue;
	            nos[i] = no.getValor();
	            
	            for(NoArvore filho : no.getFilhos()){
	                nosVisitar.push(filho);
	            }
	            i++;
	        }

	        return nos;
			
		}
	}

