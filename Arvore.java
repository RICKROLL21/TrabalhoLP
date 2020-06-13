import java.util.Stack;

	public class Arvore implements ArvoreNAry {

	    // Implementar a Interface GeralTree
	    private NoArvore raiz;
	    private int tamanho;

	    @Override
	    public NoArvore inserir( int num ) {
	        if ( raiz != null) 
	            throw new IllegalStateException();

	        raiz = new NoArvore(num);
	        tamanho = 1; 
	        
	        return raiz;
	        }
	        
	        
	    @Override
	    public NoArvore inserir( int num, NoArvore pai ) {
	        if ( pai == null) 
	            throw new NullPointerException();
	        
	        NoArvore temporario = new NoArvore(num);
	        pai.addFilho(temporario);
	        tamanho ++; 

	        return temporario;
	    }

		public int[] preOrder() {
			int[] nos = new int[tamanho];

	        Stack<NoArvore> nosVisitar = new Stack<>();
	        nosVisitar.push(raiz);

	        int i = 0;
	        while (!nosVisitar.empty()) {
	        	NoArvore no = nosVisitar.pop();
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

