import java.util.Stack;
import java.util.ArrayList;


	public class Arvore implements ArvoreNAry {

	    private Elemento raiz;
	    private int tamanho;
	    
	  /* public Elemento procurar(int id, Elemento no){
		   if (no == null){
		        return null;
		    }else {
		    	if (no.getFilhos()==id){
		            return procurar(id, raiz.getFilhos());
		    }else if (no.getFilhos()==id){
	            return procurar(id, no.getFilhos());
	        }else{
	            System.out.println(no.getValor()==id);
	    }
	    return no;
	    }*/
		
		
	    

	    

	    public Arvore() {
	    	
			// TODO Auto-generated constructor stub
		}
	    		
		
	    // Implementar a Interface GeralTree
	 
		
	    
	    
	    //Só raiz
	    @Override
	    public Elemento inserir(int id, int idade, String nome) throws IllegalStateException { 
	        if ( raiz != null) 	
	            throw new IllegalStateException();

	        raiz = new Elemento(id, idade, nome);
	        tamanho = 1; 
	        
	        return raiz;
	        }
	        
	    //Filhos    
	    @Override
	    public Elemento inserir(Elemento pai, int id, int idade, String nome) {
	        if ( pai == null) {
	            throw new NullPointerException();
	    	}else{
	        Elemento temporario = new Elemento(id, idade, nome);
	        pai.getFilhos().add(temporario);
	        tamanho ++; 

	        return temporario;
	    	}
	    }
	    
	    
	    
	    
	    
		public Elemento[] imprimirPreOrder() {
			Elemento[] nos = new Elemento[tamanho];
			
			
	        Stack<Elemento> nosVisitar = new Stack<>();
	        nosVisitar.push(raiz);

	        int i = 0;
	        while (!nosVisitar.empty()) {
	        	Elemento no = nosVisitar.pop();
	            if (no == null)
	                continue;
	            nos[i] = no;
	            
	            for(Elemento filho : no.getFilhos()){
	                nosVisitar.push(filho);
	            }
	            i++;
	        }

	        return nos;
			
		}
		@Override
		public int[] preOrder() {
			// TODO Auto-generated method stub
			return null;
		}
	}

