package day35_Encapsulation.Tasks.credential;

public class CredentialObject {

    public static void main(String[] args) {

        Credentials cre1 = new Credentials("ismail","1o02fc.01");

        System.out.println(cre1);

        cre1.setPassword("dawf");

        System.out.println(cre1);


    }

}
