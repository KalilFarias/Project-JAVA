package Projeto_;
import java.util.Scanner;

public class Funcionario {
	
	private String nome_func;
	private String idade;
	private String setor;
	private String cpf; 
	int id;
	

static void adicionar() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("digite quantos funcionarios deseja adicionar: ");
	int quantidade = scan.nextInt();
	scan.nextLine();
	
	for(int i = 0; i < quantidade; i++) {
		
		Funcionario novo = new Funcionario();
		
		System.out.println("digite o nome do funcionario: ");
		novo.nome_func = scan.nextLine();
		System.out.println("digite a idade do funcionario: ");
		novo.idade = scan.nextLine();
		System.out.println("digite o setor do funcionario: ");
		novo.setor = scan.nextLine();
		System.out.println("digite o cpf do funcionario: ");
		novo.cpf = scan.nextLine();
		novo.id = Menu.id;
		Menu.id++;
		System.out.println("a ID do funcionario é: "+ novo.id);
		
		Main.lista.add(novo);
		
	}
	
	//scan.close();
	
}

public static String getNome_func(Funcionario aux) {
	return aux.nome_func;
}

public static void setNome_func(String nome_func, Funcionario aux) {
	aux.nome_func= nome_func;
}

public static String getIdade(Funcionario aux) {
	return aux.idade;
}

public static void setIdade(String idade, Funcionario aux) {
	aux.idade = idade;
}

public static String getSetor(Funcionario aux) {
	return aux.setor;
}

public static void setSetor(String setor,Funcionario aux) {
	aux.setor = setor;
}

public static int getId(Funcionario aux) {
	return aux.id;
}

public static void setId(int id, Funcionario aux) {
	aux.id = id;
}

public static String getCpf(Funcionario aux) {
	return aux.cpf;
}

public static void setCpf(String cpf, Funcionario aux) {
	aux.cpf = cpf;
}
	
}