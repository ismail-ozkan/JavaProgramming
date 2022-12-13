package day35_Encapsulation.Tasks.bankAccount;

public class BankAccountObject {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("ismail",140590,10000);

        System.out.println(account1.getBalance());

        account1.deposit(1000);

        account1.checkbalance();

        account1.withdraw(9000);

        account1.checkbalance();

        account1.withdraw(-1500);

        account1.checkbalance();

    }

}
