package MySelf;

public class Char_Int_String {

    public static void main(String[] args) {

        String result1 = "";
        for (int i = 'A'; i < 'Z'; i++) {
            result1+= i;
        }
        System.out.println(result1);//65666768697071727374757677787980818283848586878889
        String result2 = "";
        for (char i = 'A'; i < 'Z'; i++) {
            result2+= i;//
        }
        System.out.println(result2);//ABCDEFGHIJKLMNOPQRSTUVWXY

        String result3 = "";
        for (int i = 'A'; i < 'Z'; i++) {
            result3+= (char)i;//
        }
        System.out.println(result3);//ABCDEFGHIJKLMNOPQRSTUVWXY

        String result4 = "";
        for (char i = 'A'; i < 'Z'; i++) {
            result4+=(int)i;//
        }
        System.out.println(result4);//65666768697071727374757677787980818283848586878889
        String result5 = "";
        for (char i = 'A'; i <= 'Z'; i++) {
            result5+=i;//
        }
        System.out.println(result5);


    }

}
