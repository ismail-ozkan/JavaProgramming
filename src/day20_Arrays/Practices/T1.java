package day20_Arrays.Practices;

public class T1 {
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
    public static void main(String[] args) {

        String[] classmates = {"Halid Erdur", "İbrahim Erdur", "Tarık Erdur", "İsmail Özkan", "Seyyid Alçık", "Burhan Açıkalın",
                "Adem Öztürk", "Görkem Ağaç", "İbrahim Dündar", "Mehmet Yıldız"};

        for (int i = 0; i < classmates.length; i++) {
            char ch1 = classmates[i].charAt(0);
            char ch2 = classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(ch1+"."+ch2);
        }



    }

}
