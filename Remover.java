package Projeto_;
import java.util.Scanner;

public class Remover {
	
	public static void remover () {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite a id do funcionario que deseja remover");
		int busca = scan.nextInt();
		int index = Main.lista.size();
		int i = 0;
		
		while(i < index) {
			
			Funcionario aux = Main.lista.get(i);

		if(busca == aux.id) {
				
			
				System.out.println("-----------------------------------------------------");
				System.out.println(Funcionario.getNome_func(aux));
				System.out.println(Funcionario.getIdade(aux));
				System.out.println(Funcionario.getSetor(aux));
				System.out.println(Funcionario.getCpf(aux));
				System.out.println("-----------------------------------------------------");
				
		}
			
			i++;
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("certeza que deseja remover esse funcionario ? sim ou nao ?(sem acento!)");
		scan.nextLine();
		String escolha = scan.nextLine();
		System.out.println("----------------------------------------------------------");
		
		if(escolha.equals("nao") || escolha.equals("NAO") || escolha.equals("Nao")  ) {
			
			return;
			
		}
		
		if(escolha.equals("sim") || escolha.equals("SIM") || escolha.equals("Sim") ) {
		
			i = 0;
			
		while(i < index) {
			
			Funcionario aux = Main.lista.get(i);

			if(busca == aux.id) {
			
				Main.lista.remove(i);				
				System.out.println("removido com sucesso");
				
				return;
			}
			
			i++;
		}
		
		//scan.close();
		}
			
			System.out.println("o usuario do ID digitado é inexistente.");
		
	}
}
