package Projeto_;
import java.util.Scanner;

public class Mostrar {
	
	public static void mostrar() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite a id do funcionario, para ver os dados");	//escolha do funcionario que você deseja ver as informações 
		int busca = scan.nextInt();												//a partir do id recebido, sendo ele diferente dos de login
		
		int index = Main.lista.size();
		int i = 0;
		
		while(i < index) {												//algoritmo de busca
			
			Funcionario aux = Main.lista.get(i);

			if(busca == aux.id) {
				
				System.out.println("-----------------------------------------------------");
				System.out.println(Funcionario.getNome_func(aux));								//se o ID escolhido pelo usuário existir, ele 
				System.out.println(Funcionario.getIdade(aux));									//entrará no if e exibirá as informações do mesmo
				System.out.println(Funcionario.getSetor(aux));
				System.out.println(Funcionario.getCpf(aux));
				System.out.println("-----------------------------------------------------");
				return;
			}
		
			i++;	

		}
		
				System.out.println("---------------------------------------------------------------");	//se não, exibirá a mensagem de não existente e finalizará  
				System.out.println("este usuário é inexistente");										//a chamada de função, fazendo assim com que retorne ao
				System.out.println("--------------------------------------------------------------");
		
		//scan.close();
		}
	
}
