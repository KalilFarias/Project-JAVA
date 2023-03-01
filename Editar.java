package Projeto_;
import java.util.Scanner;

public class Editar {

	public static void editar() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite a ID do funcionario que deseja editar");
		int busca = scan.nextInt();
		int i = 0;
		
		int index = Main.lista.size();
		while(i < index) {
			
			Funcionario aux = Main.lista.get(i);
			
			if(busca == aux.id) {
				
				
				System.out.println("-----------------------------------------------------");
				System.out.println("os dados atuais do funcionário são os seguintes: ");
				System.out.println(Funcionario.getNome_func(aux));
				System.out.println(Funcionario.getIdade(aux));
				System.out.println(Funcionario.getSetor(aux));
				System.out.println(Funcionario.getCpf(aux));
				System.out.println("-----------------------------------------------------");
				
				System.out.println("---------------------------------------------------------");
				System.out.println("certeza que deseja editar esse funcionario ? sim ou nao ?(sem acento pls)");
				scan.nextLine();
				String escolha = scan.nextLine();
				System.out.println("---------------------------------------------------------");
				
				if(escolha.equals("nao") || escolha.equals("NAO") || escolha.equals("Nao")  ) {
					
					return;
					
				}
				
				if(escolha.equals("sim") || escolha.equals("SIM") || escolha.equals("Sim") ) {
				
				System.out.println("digite o novo nome para o funcionario: ");
				Funcionario.setNome_func(scan.nextLine(), aux);
				System.out.println("digite a nova idade para o funcionario: ");
				Funcionario.setIdade(scan.nextLine(), aux);
				System.out.println("digite o novo setor para o funcionario: ");
				Funcionario.setSetor(scan.nextLine(), aux);		
				System.out.println("digite o novo cpf para o funcionario: ");
				Funcionario.setCpf(scan.nextLine(), aux);	
				System.out.println("atualizado com sucesso ");
				return;
				
				}	
					System.out.println("-----------------------------------------");
					System.out.println("reposta invalida, será retornado ao menu ");
					System.out.println("-----------------------------------------");
		}
			i++;
		//scan.close();
		}
	}
	
}
		
	
