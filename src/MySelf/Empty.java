package MySelf;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Empty {

    public static void main(String[] args) {

        persistence(4);

    }

    private static void persistence(int num) {

        String str = num+"";
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        do {
            int sum  = 1;
            for (int i = 0; i < str.length(); i++) {
                list.add(parseInt(str.charAt(i)+""));
            }
            for (Integer integer : list) {
                sum*=integer;
            }
            str = sum+"";
            if (str.length()!=1){
                counter++;
            }
        } while (str.length()==1);
        System.out.println(counter);

    }


}
