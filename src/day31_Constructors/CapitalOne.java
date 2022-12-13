package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Arslan",1324656796);

        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        account1.withdraw(900);


        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun",594432846);

        account2.deposit(1000);
    }


}
