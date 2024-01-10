package Ex1_Account;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Julio", 50.00);
        Account account2 = new Account("Alberta", 10.00);

        Payments.deposit(account1, 10.00);

        account1.printBalance();

        Payments.deposit(account2, 77.00);

        account2.printBalance();


        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor de depósito para a conta 1: ");
        double depositAmout = input.nextDouble();
        System.out.printf("%no valor %.2f foi adicionado a conta 1: %n%n",
                depositAmout);
        account1.deposit(depositAmout);

        System.out.printf("%s Saldo: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s Saldo: $%.2f %n",
                account2.getName(),account2.getBalance());

        System.out.print("Insira o valor de depósito para a conta 2: ");
        depositAmout = input.nextDouble();
        System.out.printf("%no valor %.2f foi adicionado a conta 1: %n%n",
                depositAmout);
        account2.deposit(depositAmout);

        System.out.printf("%s Saldo: $%.2f %n",
                account1.getName(),account1.getBalance());
        System.out.printf("%s Saldo: $%.2f %n",
                account2.getName(),account2.getBalance());
        Payments.printzin("alo");

/*      Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.printf("Initial name is: %s%n%n", myAccount.initname);
        System.out.println("------------------------------------------------");
        System.out.print("Please enter your name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println("------------------------------------------------");

        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());*/
    }
}
