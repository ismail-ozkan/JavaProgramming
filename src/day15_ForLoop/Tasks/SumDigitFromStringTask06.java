package day15_ForLoop.Tasks;

public class SumDigitFromStringTask06 {

    public static void main(String[] args) {

        String text = "A5T84JDXA924DJA8A6ASF";
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)>='0'&&text.charAt(i)<='9') {
                sum += text.charAt(i)-48;
            }
        }

        System.out.println(sum);


        String sum2 = "";
        for (int i = 0; i< text.length(); i++) {
            if (text.charAt(i)>='0'&&text.charAt(i)<='9') {
                sum2 += ""+text.charAt(i);
            }
        }
        String sum3 = "";
        for (int i = 0; i < sum2.length(); i++) {
            if (sum2.charAt(i)==sum2.charAt(sum2.length()-1)) {
                sum3 += sum2.charAt(i)+" = ";
            } else {
                  sum3 += sum2.charAt(i)+" + ";
            }
        }



        System.out.println(sum3 + sum);
    }

}
