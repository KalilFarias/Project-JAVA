package Projeto_;

import java.util.Scanner;

public class Menu2 {

    public static void menuInput () throws Exception {

    	int choice = -1;
    	
 do {
    	
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\n");
        
        System.out.println("---- ATM Banking Machine ----");
        Thread.sleep(1000);
        System.out.println("Verificar saldo, digite 1");	//imprimindo opções de escolha para o usuário cliente
        Thread.sleep(500);
        System.out.println("Depósito, digite 2");
        Thread.sleep(500);
        System.out.println("Retirar, digite 3");
        System.out.println("Retornar ao Home, digite 4");
        System.out.print("Escolha uma opção: ");
        
        choice = scan.nextInt();
        
        // scan.close();

        	if(choice == 1) {

            Transactions.showBalance();

        	}
            
        	else if(choice == 2){
            	
            System.out.print("Quanto voc� quer depositar? $ ");
            Transactions.depositMoney(scan.nextDouble());	//chamada de funções a partir da escolha do usu�rio cliente
            
            Transactions.showBalance();

        	}

            else if(choice == 3){
            
            System.out.print("Quanto você quer sacar? $");
            Transactions.withdrawMoney(scan.nextDouble());
            Transactions.showBalance();

            }

            else if((choice > 4) || choice < 1 ) {
            System.out.println("Opção inválida.");
            

            }
 	
 	}while(choice != 4);
    

    }
}