package day11_Switch_ScannerIntro;

public class NumberToWords_TernaryTask {

    public static void main(String[] args) {

        int num = 5;

        if (num>=0&&num<=9){
            System.out.println((num==0)? "Zero" :(num==1)? "One" :(num==2)? "Two" :(num==3)? "Three" :(num==4)? "Four"
                    :(num==5)? "Five" :(num==6)? "Six" :(num==7)? "Seven" :(num==8)? "Eight"
                    :"Nine");


        } else {
            System.out.println("Invalid Number");
        }

        String result = (num>=0&&num<=9)?
                (num==0)? "Zero" :(num==1)? "One" :(num==2)? "Two" :(num==3)? "Three" :(num==4)? "Four"
                        :(num==5)? "Five" :(num==6)? "Six" :(num==7)? "Seven" :(num==8)? "Eight"
                        :"Nine"
        : "Invalid Number";
    }

}
