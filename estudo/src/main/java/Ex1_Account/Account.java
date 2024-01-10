package Ex1_Account;

public class Account implements Payments{

    private String name;
    private Double balance;
    public String initname = "NoobLogado";

    public Account(String name, Double balance){
        this.name = name;
        if (balance > 0.0) this.balance = balance;
    }
    @Override
    public void deposit(Double depositAmount){
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }



    public Double getBalance(){
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printBalance() {
        System.out.printf("Account name is: %s . And atual balance: $%.10f %n",
                name, balance );
    }
}
