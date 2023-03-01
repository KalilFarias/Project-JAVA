package Projeto_;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Iterator;

public class Login2 {
    
    public static void login2 () throws Exception {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n\n");
        
        System.out.println("Digite o ID da sua conta como cliente: ");//verificação se o id digitado pelo funcionário está
		        int account_check = scan.nextInt();					//correto, e se é pra conta como funcionário

		        Iterator<Integer> it = Signin2.account_id2.iterator();

		while(it.hasNext()) {        
        if (account_check == it.next() ) {
        	System.out.println("------------------------------------------------------");
            System.out.println("Login bem sucedido!");				//se for bem sucedido entratará no menu para funcionários
        	System.out.println("------------------------------------------------------");

			Menu2.menuInput();
            return;
        }
        
		} // scan.close();
		
        System.out.println("Conta inválida. O programa retornará ao Home.");//se não retornará ao home
        System.out.println("----------------------------------------------------------");
        return;
    
    }
    
}