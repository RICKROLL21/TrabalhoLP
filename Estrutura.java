import java.util.ArrayList;
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
		case 0: System.exit(0);break;
		case 1:menuCriacaoArvoreGen();break;
		case 2:menuArvoreGenealogica();break;
		default: System.out.println("Op��o inv�lida");
		}
		
	}while(escolha != 0);
	
	
}
public void menuCriacaoArvoreGen() {
	String n=null;
	int idade=0;	
	int	escolha = 0, numfilhos = 0;
	Elemento e = new Elemento();
	
	do {
	
	System.out.println("\nDigite o nome do seu familiar. (Come�ando pelo av� at� seus familiares mais recentes)");
	n = ler.next();
	e.setNome(n);
	
	System.out.println("Digite a idade.");
	idade = ler.nextInt();
	e.setIdade(idade);
	
	System.out.println("Quantos filhos tem o av�?");
	numfilhos = ler.nextInt();
		
	ArrayList<Elemento> filhos = new ArrayList<Elemento>(numfilhos); 
	e.setFilhos(filhos);
	//filhos.setFilhos(filhos);
	
	for(int i=0; i<numfilhos;i++) {
		System.out.println("Digite o nome do seu familiar. (Agora nomeie os filhos do av�)");
		n = ler.next();
		e.setNome(n);
		
		System.out.println("Digite a idade.");
		idade = ler.nextInt();
		e.setIdade(idade);
	
		filhos.add(new Elemento(idade, n));
		System.out.println(filhos.toString());
		
	}
	
	
	System.out.println("Para continuar prima 1!");
	escolha= ler.nextInt();
	
	
	switch(escolha){
	case 0:break;
	case 1:menuAvo();break;
	default: System.out.print("\nNovo membro da fam�lia \n");
	
	}

	}while(escolha != 0);
	
	
}
public void menuArvoreGenealogica() {
	Arvore impLista = new Arvore();
	impLista.traverssia();
	int escolha;
	do {
		
	System.out.println(impLista.traverssia());//mostrar a arvore
	System.out.println("\n0-Voltar ao menu inicial\n");
	escolha=ler.nextInt();	
	
	
		switch(escolha) {
		case 0:break;
		default:;
	
		}
		
	}while(escolha != 0);
	

}
public void menuFilho() {
	String n=null;
	int idade=0;	
	int	escolha = 0, numnetos =0;
	Elemento e = new Elemento();
	do {
		System.out.println("Menu Netos do Av�");
		
		System.out.println("\nNovo membro da fam�lia \n");
	
		System.out.println("Quantos filhos tem este pai?");
		numnetos = ler.nextInt();
		
		ArrayList<Elemento> netos = new ArrayList<Elemento>(numnetos); 
		e.setNetos(netos);
		for(int i=0; i<numnetos;i++) {
			System.out.println("Digite o nome do seu familiar. (Agora nomeie os netos do av�)");
			n = ler.next();
			e.setNome(n);
			
			System.out.println("Digite a idade.");
			idade = ler.nextInt();
			e.setIdade(idade);
		
			netos.add(new Elemento(idade, n));
			System.out.println(netos.toString());
			
		} 
		
		System.out.println("O irm�o tem filhos?");
		System.out.println("1-Sim");
		System.out.println("2-N�o");
		escolha=ler.nextInt();
		
		switch(escolha){
		case 1:menuFilho();break;
		case 2:menuInicial();break;
		
		default: System.out.println("Op��o inv�lida");
		}
		
	}while(escolha != 0);
}
public void menuAvo() {
	int escolha = 0;
	do {
		System.out.println("\nO av� tem netos?");
		System.out.println("1-Sim");
		System.out.println("2-N�o (ou n�o tem mais irm�os)");
		escolha=ler.nextInt();
		
		switch(escolha){
		case 0:break;
		case 1:menuFilho();break;
		case 2:menuInicial();break;
		
		default: System.out.println("Op��o inv�lida");
		}
		
	}while(escolha != 0);
}
}