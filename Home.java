package Projeto_;
import java.util.Scanner;

public class Home {
	
	static int escolha = -1;
	
	public static void home() throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Bem vindo ao nosso sistema de banco, o que deseja utilizar ?");
		System.out.println("------------------------------------------------------------");
        Thread.sleep(1000);
		System.out.println("Tabela de funcionarios(APENAS PARA ADMS) [1]");	//imprimindo na tela as opções para o usuario
        Thread.sleep(500);
		System.out.println("Acessar sua conta como cliente [2]");
        Thread.sleep(500);
		System.out.println("Finalizar programa [0]");
		
		escolha = scan.nextInt();
		
		if(escolha == 1) {
			
			Clear.clear();
			
			System.out.println("Se você já tiver um ID digite 0, se não tecle qualquer outro numero para fazer o cadastro.");
			int x = scan.nextInt(); // opção de escolha para fazer o cadastro como funcionario
			
			if(x != 0) {    
			
			Signin.signin();
			
			}
			
			Login.login();
			}
		
		else if(escolha == 2) {
			
			System.out.println("Se você já tiver um ID digite 0, se não tecle qualquer outro numero para fazer o cadastro.");
			int y = scan.nextInt(); // opção de escolha para fazer o cadastro como cliente
			
			Clear.clear();
		    	
			if(y != 0) {
				
			Signin2.signin2();
			
			}
			
			Login2.login2();}
		
		}while(escolha != 0); // caso a escolha for, o programa sairá do loop e finalizará
		
		System.out.println("Programa finalizado com sucesso !");
		
	}

}
