package Projeto_;

import java.util.Scanner;
import java.util.Iterator;

public class Login {
    
    public static void login () throws Exception {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n\n");
        
        System.out.println("Digite o ID da sua conta como funcionário: "); //verificação se o id digitado pelo funcionário está
        int account_check = scan.nextInt();	//correto, e se é pra conta como funcionário

        Iterator<Integer> it = Signin.account_id.iterator();
        
        while(it.hasNext()){        
        	if (account_check == it.next()) {
        	Clear.clear();
        	System.out.println("------------------------------------------------------");
        	System.out.println("Login bem sucedido!"); 					//se for bem sucedido entratará no menu para funcionários
        	System.out.println("------------------------------------------------------");
			Menu.menu();
			return;
        } 
    }
        	Clear.clear();
            System.out.println("Conta inválida. O programa retornará ao Home.");// se não retornará ao home
            System.out.println("------------------------------------------------------");
            return;
        // scan.close();
    }
}