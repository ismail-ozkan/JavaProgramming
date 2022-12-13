package day09_IfAndElse_MultiBranchIf;

public class ChooseLanguage {

    public static void main(String[] args) {

        int number = 3;

        if (number>=1 && number<=5) {
            if (number==1){
                System.out.println("Hello, thank for your call");
            } else if (number==2) {
                System.out.println("Hola, gracias para llamar");
            } else if (number==3) {
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
            } else if (number==4) {
                System.out.println("Privet, spasibo za vash zvonok");
            } else{
                System.out.println("Merci ,pour votre appel");
            }


        }else {
            System.out.println("Invalid Number");
        }





    }
}
