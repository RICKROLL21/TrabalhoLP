
public interface ArvoreNAry {

		/**
		 * Insere um numero inteiro numa arvore vazia
		 * 
		 * @param num  o valor inteiro a inserir 
		 * @return  uma referencia para o novo no raiz da arvore
		 * @throws  IllegalStateException se a arvore nao estiver vazia
		 */
		public Elemento inserir( int id, int idade, String nome ) throws IllegalStateException;
		
		
		/**
		 * Insere um numero inteiro numa arvore
		 * 
		 * @param num   o valor inteiro a inserir
		 * @param pai   referencia para o no pai onde a insercao tera lugar 
		 * @return      uma referencia para o no criado na arvore
		 * @throws      NullPointerException se o pai for igual a null 
		 */
		public Elemento inserir(Elemento pai,int id, int idade, String nome) throws NullPointerException;
		
		
		/**
		 *  Travessia em Profundidade em PreOrder 
		 *  
		 * @return um array dos valores inteiros que estao nos nos por ordem de visita 
		 */
		public int[] preOrder();
		
		public Elemento getElementoRecursiveFilhos(Elemento elemento,int id); 
		
		public Elemento getElementoRecursiveNetos(Elemento elemento, int indexDoArrayListNeto);
		
	
}
