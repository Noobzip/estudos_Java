package Ex1_Account;

public interface Payments {
    void deposit(Double balance);
    static void printzin(String x){
        System.out.print(x);
    }
    static void deposit(Account account, Double balance){

         account.deposit(balance);
    }
}
