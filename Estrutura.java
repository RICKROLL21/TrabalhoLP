import java.util.Scanner;



public class Estrutura {
	Scanner ler = new Scanner(System.in);
	
	
public void menuInicial() {
	int escolha = 0;
	
	do {
		System.out.println("\n1-Iniciar Programa");
		System.out.println("2-Ver �rvore geneal�gica");
		System.out.println("0-Sair do Programa \n");
		escolha=ler.nextInt();
		
		switch(escolha){
		case 0: break;
		case 1:menuCriacaoArvoreGen();break;
		case 2:menuArvoreGeneal�gica();break;
		default: System.out.println("Op��o inv�lida");
		}
		
	}while(escolha != 0);
	
	
}



public void menuCriacaoArvoreGen() {
	
	Elemento elemento = new Elemento();
	String n;
	int id, idade;
	int	escolha = 0;
	
	
	do {
	
	System.out.println("\nDigite o nome do seu familiar. (Come�ando pelo av� at� seus familiares mais recentes)");
	n = ler.next();
	elemento.setNome(n);
	
	
	System.out.println("Digite a idade.");
	idade = ler.nextInt();
	elemento.setIdade(idade);
	
	System.out.println("Para concluir e sair deste menu carregue 0");
	escolha= ler.nextInt();
	
	switch(escolha){
	case 0:break;
	default: System.out.print("\nNovo membro da fam�lia \n");
	
	}

	}while(escolha != 0);
	
	
}

public void menuArvoreGeneal�gica() {
	
	int escolha;
	do {
		
	System.out.println();//mostrar a arvore
	System.out.println("\n0-Voltar ao menu inicial\n");
	escolha=ler.nextInt();	
	
	
		switch(escolha) {
		case 0:;break;
		default:;
	
		}
		
	}while(escolha != 0);
	
	
	
}

}




