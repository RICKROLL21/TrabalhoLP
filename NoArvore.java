import java.util.ArrayList;

		public class NoArvore {


		    private int valor;
		    
		    

		    private ArrayList <NoArvore> filhos;

		    

		    public int getValor() {
		        return valor;
		    }
		    public void setValor(int valor) {
		        this.valor = valor;
		    }
		    
		    

		    public ArrayList<NoArvore> getFilhos() {
		        return filhos;
		    }
		    
		    
		    
		    public void addFilho (NoArvore filho) {
		        filhos.add(0,filho);
		    }

		    
		    
		public void removeFilho (NoArvore filho) {

		        filhos.remove(filho);

		    }

		
		
		public void removeindex (int filho) {

		    filhos.remove(filho);

		}


		public NoArvore (int valor) {

		    this.valor = valor;

		    filhos  = new ArrayList();

		}

	

}
