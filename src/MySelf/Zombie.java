package MySelf;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {25, 0, 24, 0, 15, 20, 10, 4};
        // {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int[] zeroArr = new int[inhabitants.length];
        int day = 0;
        while (!(Arrays.equals(inhabitants, zeroArr))) {
            System.out.println("Day " + (day++) + " " + Arrays.toString(inhabitants));
            int[] counter = new int[inhabitants.length];
            int c1 = 0;
            for (int i1 = 0; i1 < inhabitants.length; i1++) {
                int inh = inhabitants[i1];
                if (i1 == 0 && inh == 0) {
                    counter[c1] = i1;
                    c1++;
                } else if (i1 == inhabitants.length - 1 && inh == 0) {
                    counter[c1] = i1;
                    c1++;
                } else if (inh == 0) {
                    counter[c1] = i1;
                    c1++;
                }
            }
            int[] counter2 = Arrays.copyOfRange(counter, 0, c1);//1,3
            //{25, 0, 24, 0, 15, 20, 10, 4};
            for (int c2 : counter2) {
                for (int i = 0; i < 8; i++) {
                    if (i == 0 && c2 == 1) {
                        inhabitants[i]/=2;
                    }
                    if (i==1&&(c2==0||c2==2)){
                        inhabitants[i]/=2;
                    }
                    if (i==2&&(c2==1||c2==3)){
                        inhabitants[i]/=2;
                    }
                    if (i==3&&(c2==2||c2==4)){
                        inhabitants[i]/=2;
                    }
                    if (i==4&&(c2==3||c2==5)){
                        inhabitants[i]/=2;
                    }
                    if (i==5&&(c2==4||c2==6)){
                        inhabitants[i]/=2;
                    }
                    if (i==6&&(c2==5||c2==7)){
                        inhabitants[i]/=2;
                    }
                    if (i ==7 && c2 == 6) {
                        inhabitants[i]/=2;
                    }
                }
            }

        }
        System.out.println("Day "+(day++)+" "+Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

    }
}
    

