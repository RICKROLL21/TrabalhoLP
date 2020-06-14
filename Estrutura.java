

import java.util.Scanner;



public class Estrutura {
	Scanner ler = new Scanner(System.in);
	
	
public void menuInicial() {
	int escolha = 0;
	
	do {
		System.out.println("\n1-Iniciar Programa");
		System.out.println("2-Ver Árvore genealógica");
		System.out.println("0-Sair do Programa \n");
		escolha=ler.nextInt();
		
		switch(escolha){
		case 0: break;
		case 1:menuCriacaoArvoreGen();break;
		case 2:menuArvoreGenealogica();break;
		default: System.out.println("Opção inválida");
		}
		
	}while(escolha != 0);
	
	
}



public void menuCriacaoArvoreGen() {
	String n=null;
	int id=0, idade=0;	
	int	escolha = 0;
	Elemento e = new Elemento(id,idade,n);
	
	do {
	
	System.out.println("\nDigite o nome do seu familiar. (Começando pelo avô até seus familiares mais recentes)");
	n = ler.next();
	e.setNome(n);
	
	
	System.out.println("Digite a idade.");
	idade = ler.nextInt();
	e.setIdade(idade);
	
	System.out.println("Para continuar presse 1!");
	escolha= ler.nextInt();
	
	switch(escolha){
	case 0:break;
	case 1:menuAvo();break;
	default: System.out.print("\nNovo membro da família \n");
	
	}

	}while(escolha != 0);
	
	
}

public void menuArvoreGenealogica() {
	
	int escolha;
	do {
		
	System.out.println();//mostrar a arvore
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
	int id=0, idade=0;	
	int	escolha = 0;
	Elemento e = new Elemento(id,idade,n);
	do {
		System.out.println("Menu Filhos do Avô");
		
		System.out.println("\nNovo membro da família \n");
		
		System.out.println("\nDigite o nome do seu familiar. (Agora comece pelos filhos do avô até seus familiares mais recentes)");
		n = ler.next();
		e.setNome(n);
		
		
		System.out.println("Digite a idade.");
		idade = ler.nextInt();
		e.setIdade(idade);
		
		System.out.println("Para continuar presse 1!");
		escolha= ler.nextInt();
		escolha=ler.nextInt();
		
		switch(escolha){
		case 0:break;
		case 1:menuFilho();break;
		
		default: System.out.println("Opção inválida");
		}
		
	}while(escolha != 0);
}


public void menuAvo() {
	int escolha = 0;
	do {
		System.out.println("\nNovo membro da família \n");
		System.out.println("\nO avô tem mais filhos?");
		System.out.println("1-Sim");
		System.out.println("2-Não");
		System.out.println("3-Não, mas tem netos.\n");
		escolha=ler.nextInt();
		
		switch(escolha){
		case 0:break;
		case 1:menuFilho();break;
		case 2:menuInicial();break;
		case 3:menuNeto();break;
		
		default: System.out.println("Opção inválida");
		}
		
	}while(escolha != 0);
}

public void menuNeto() {
	String n=null;
	int id=0, idade=0;	
	int	escolha = 0;
	Elemento e = new Elemento(id,idade,n);
	do {
		System.out.println("Menu Netos do Avô");
		
		System.out.println("\nNovo membro da família \n");
		
		System.out.println("\nDigite o nome do seu familiar. (Agora comece pelos netos do avô até seus familiares mais recentes)");
		n = ler.next();
		e.setNome(n);
		
		
		System.out.println("Digite a idade.");
		idade = ler.nextInt();
		e.setIdade(idade);
		escolha=ler.nextInt();
		
		switch(escolha){
		case 0:break;
		case 1:menuFilho();break;
		case 2:menuInicial();break;
		case 3:menuNeto();break;
		
		default: System.out.println("Opção inválida");
		}
		
	}while(escolha != 0);
}
}






