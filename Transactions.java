package Projeto_;

public class Transactions {

    private static double balance = 0;
    public static double withdraw;		//funções para opções de transações posíveis para os clientes 
    public static double deposit;
    
    public static double depositMoney (double deposit) {
    
        if (deposit < 0) {
            System.out.println("Valor inválido."); //função de depositar
        } else if (deposit > 0) {
            balance = balance + deposit;
        }

        return balance;

    }

    public static double withdrawMoney (double withdraw) {

        if (withdraw < 0) {
            System.out.println("Valor inválido.");
        } else if (withdraw > balance) {
            System.out.println("Saldo insuficiente.");
            System.out.println("Valor inválido.");
        } else if (withdraw <= balance) {
            return balance -= withdraw;
        }
        return balance;
    
    }

        public static int showBalance () {

            System.out.printf("Seu saldo é: $ %.2f\n", balance);	//função de verificar saldo
            return 0;
        }

    }