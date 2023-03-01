package Projeto_;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Signin2 {
    
	static ArrayList<Integer> account_id2 = new ArrayList<Integer>();
	static int i = 0;

    public static void signin2 () {
        
    	Clear.clear();
    	
        Random r = new Random();
        User user = new User();
        

        Scanner scan = new Scanner(System.in);

        System.out.print("* Por favor, digite seu nome de login (não esqueça): ");
        user.setUser_name(scan.nextLine());
        System.out.print("* Digite sua senha (não use caracteres especiais): ");
        user.setPasswd(scan.nextLine());
        
        Clear.clear();
        
        System.out.println("Cadastro concluído!");
        account_id2.add(r.nextInt(1000000));
        // scan.close();
        
        
        System.out.println("O ID da sua conta como cliente é: " + account_id2.get(i));
        i++;
    }

    public static ArrayList<Integer> getAccount_id2() {
		return account_id2;
	}

	public static void setAccount_id2(ArrayList<Integer> account_id2) {
		Signin2.account_id2 = account_id2;
	}

	public static String getUser_name() {

        return Signin2.getUser_name();

    }
    public static String getPasswd () {

        return Signin2.getPasswd();

    }
}
