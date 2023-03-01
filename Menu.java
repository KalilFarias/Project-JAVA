
package Projeto_;

import java.util.Scanner;

public class Menu {
	static int id = 0;
	
	static Scanner scan = new Scanner(System.in);

	public static void menu () throws Exception {
		int escolha = -1;
		do {
		
		System.out.println("digite a função que deseja utilizar da sua folha de funcionarios: ");
        Thread.sleep(1000);
		System.out.println("para adicionar um funcionario digite [1]");
        Thread.sleep(500);
		System.out.println("para editar informações de um funcionario ja existente digite [2]");	//imprimir a opção escolhida pelo usuário
        Thread.sleep(500);
		System.out.println("para ver as informações de algum funcionario [3]");
        Thread.sleep(500);
		System.out.println("para remover um funcionario [4]");
		System.out.println("para voltar ao Home [5]");
		
		escolha = scan.nextInt();
		
		if(escolha == 1){
			Clear.clear();
		Funcionario.adicionar();		
		}
		
		if(escolha == 2) {
			Clear.clear();	
		Editar.editar(); 			//função de escolha para abrir a opção desejada pelo usuario funcionario
		}
		
		if(escolha == 3) {
			Clear.clear();
		Mostrar.mostrar();
		}
		
		if(escolha == 4) {
			
			Clear.clear();
			Remover.remover();	
		}
		
		if(escolha < 0 || escolha > 5) {
			
			System.out.println("escolha inv�lida");
		}
						
		}while(escolha != 5); //caso a escolha for 5 a chamada da função finalizará e retornará ao home, podendo assim ser chamada novamente
		
		Clear.clear();
		
	}
	
	
}
