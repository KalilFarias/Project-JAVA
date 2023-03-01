package Projeto_;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Signin {
    
	static ArrayList<Integer> account_id = new ArrayList<Integer>();
    static int i = 0;
	
    public static void signin () {
        
        Random r = new Random();
        User user = new User();

        Scanner scan = new Scanner(System.in);

        Clear.clear();

        System.out.print("* Por favor, digite seu nome de login (não esqueça): ");
        user.setUser_name(scan.nextLine());
        System.out.print("* Digite sua senha (não use caracteres especiais!): ");
        user.setPasswd(scan.nextLine());
        
        Clear.clear();
        
        System.out.println("Cadastro concluído!");
        account_id.add(r.nextInt(1000000));
        // scan.close();
                
        System.out.println("O ID da sua conta como funcionário é: " + account_id.get(i));
        i++;
        
    }

	public static ArrayList<Integer> getAccount_id() {
		return account_id;
	}



	public static void setAccount_id(ArrayList<Integer> account_id) {
		Signin.account_id = account_id;
	}

	public static String getUser_name() {

        return Signin.getUser_name();

    }
    public static String getPasswd () {

        return Signin.getPasswd();

    }
}
