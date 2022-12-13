package MySelf.soloLearn.numberToWord;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberToWord {

    public static void main(String[] args) {

        int a = 950014;
        numberToWord(a);

    }

    public static void numberToWord(int number){

        ArrayList<String> result = new ArrayList<>();

        ArrayList<Integer> listOfDigit = new ArrayList<>();
        int lastFigure = 0;
        while (number != 0){
            lastFigure = number%10;
            listOfDigit.add(lastFigure);
            number-=lastFigure;
            number/=10;
        }
        System.out.println(listOfDigit);
        int lOfNum = listOfDigit.size();
        if (listOfDigit.size()==0) System.exit(0);
        for (int i = listOfDigit.size()-1; i >=0 ; i--) {
            switch (i){
                case 0:
                    result.add(birler(listOfDigit.get(i)));
                    break;
                case 1:
                    result.add(onlar(listOfDigit.get(i)));
                    break;
                case 2:
                    result.add(yuzler(listOfDigit.get(i)));
                    break;
                case 3:
                    result.add(binler(listOfDigit.get(i)));
                    break;
                case 4:
                    result.add(onlar(listOfDigit.get(i)));
                    break;
                case 5:
                    result.add(yuzler(listOfDigit.get(i)));
                    break;

            }
        }
        String result1 = "";
        int k = result.size()%3;
        for (int i = 1; i < result.size()+1; i++) {
            result1+=result.get(i-1);
            if (i%3==k) {
                result1+=" ";
            }
        }


        System.out.println(result1);

    }

    public static String birler(int a){
        ArrayList<String> birler = new ArrayList<>(Arrays.asList("","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"));

        return birler.get(a);
    }
    public static String onlar(int a){
        ArrayList<String> onlar = new ArrayList<>(Arrays.asList("","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"));

        return onlar.get(a);
    }
    public static String yuzler(int a){
        ArrayList<String> yuzler = new ArrayList<>(Arrays.asList("","yüz"));
        //,"ikiyüz","üçyüz","dörtyüz","beşyüz","altıyüz","yediyüz","sekizyüz","dokuzyüz")
        for (int i = 2; i < 10; i++) {
            yuzler.add(birler(i)+"yüz");
        }
        return yuzler.get(a);
    }
    public static String binler(int a){
        ArrayList<String> binler = new ArrayList<>(Arrays.asList("bin","bin"));
        //,"ikiyüz","üçyüz","dörtyüz","beşyüz","altıyüz","yediyüz","sekizyüz","dokuzyüz")
        for (int i = 2; i < 10; i++) {
            binler.add(birler(i)+"bin");
        }
        return binler.get(a);
    }
    /*public static String onbinler(int a){
        ArrayList<String> onbinler = new ArrayList<>(Arrays.asList("","bin"));
        //,"ikiyüz","üçyüz","dörtyüz","beşyüz","altıyüz","yediyüz","sekizyüz","dokuzyüz")
        for (int i = 2; i < 10; i++) {
            onbinler.add(onlar(i));
        }
        return onbinler.get(a);
    }
    public static String yuzbinler(int a){
        ArrayList<String> yuzbinler = new ArrayList<>(Arrays.asList("",yuzler(1)+onlar(1)));
        //,"ikiyüz","üçyüz","dörtyüz","beşyüz","altıyüz","yediyüz","sekizyüz","dokuzyüz")
        for (int i = 2; i < 10; i++) {
            yuzbinler.add(yuzler(i));
        }
        return yuzbinler.get(a);
    }*/


   /* public static ArrayList<Integer> reverseList(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }*/


}
