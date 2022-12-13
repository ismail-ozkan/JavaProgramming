package day20_Arrays.Practices;

public class T2 {
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
    public static void main(String[] args) {

        String[] classmates = {"Halid Erdur", "İbrahim Erdur", "Tarık Erdur", "İsmail Özkan", "Seyyid Alçık", "Burhan Açıkalın",
                "Adem Öztürk", "Görkem Ağaç", "İbrahim Dündar", "Mehmet Yıldız"};

        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";
            for (int length = name.length()-1; length >= 0; length--) {
                reverseName+=name.charAt(length);
            }
            System.out.println(reverseName);
        }

    }
}
