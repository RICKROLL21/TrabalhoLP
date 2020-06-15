import java.util.Stack;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

	public class Arvore implements ArvoreNAry {

	    private Elemento raiz;
	    private int tamanho;
	    

	    public Arvore() {
	    	
			// TODO Auto-generated constructor stub
		}
	    		
		
	    // Implementar a Interface GeralTree
	    
	    //Só raiz
	    @Override
	    public Elemento inserir(int id, int idade, String nome) throws IllegalStateException { 
	        if ( raiz != null) 	
	            throw new IllegalStateException();

	        raiz = new Elemento(idade, nome);
	        tamanho = 1; 
	        
	        return raiz;
	        }
	        
	    //Filhos    
	    @Override
	    public Elemento inserir(Elemento pai, int id, int idade, String nome) {
	        if ( pai == null) {
	            throw new NullPointerException();
	    	}else{
	        Elemento temporario = new Elemento(idade, nome);
	        pai.getFilhos().add(temporario);
	        tamanho ++; 

	        return temporario;
	    	}
	    }
	    
	    
	    
	    
	    List<Elemento> traverssia()
	    { 
	        Queue<Elemento> queue = new LinkedList<Elemento>(); 
	    List<Elemento> lista = new LinkedList<Elemento>();
	        queue.add(raiz); 
	        while (!queue.isEmpty())
	        { 
	            Elemento tempNode = queue.poll();
	            lista.add(tempNode);
	          for(Elemento filho : tempNode.getFilhos()){
	                queue.add(filho); 
	        }

	        } 
	    return lista;
	    }


		@Override
		public Elemento getElementoRecursiveFilhos(Elemento elemento, int id) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Elemento getElementoRecursiveNetos(Elemento elemento, int indexDoArrayListNeto) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public int[] preOrder() {
			// TODO Auto-generated method stub
			return null;
		}
	}

