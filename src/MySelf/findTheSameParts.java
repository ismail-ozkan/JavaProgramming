package MySelf;

import java.util.ArrayList;

public class findTheSameParts {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("0ahUKEwj_x_mSo638AhWBVvEDHfgaBd0QhqEICAc");
        list.add("0ahUKEwiE8YbLo638AhUKX_EDHV5HCxoQhqEICAc");
        list.add("0ahUKEwjH4abTo638AhV6SPEDHdWmDWoQhqEICAc");
        list.add("0ahUKEwjk36fco638AhUsSfEDHSAhDvIQhqEICAc");
        ArrayList<String> list2 = new ArrayList<>();
        String samePart = "";
        //to find the same parts
        // compare all character by one by
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.get(i).length()-1;j++) {

                while (list.get(i).charAt(j)==list.get(i+1).charAt(j)){
                    samePart+= list.get(i).charAt(j);
                    j++;
                    if (j==list.get(i).length()-1){
                        break;
                    }
                }

                if (list.get(i).charAt(j)!=list.get(i+1).charAt(j)){
                    if (!list2.contains(samePart)&&!samePart.isEmpty()&&samePart.length()>2){
                        list2.add(samePart);
                    }
                    samePart="";
                }

            }
            samePart="";
        }

        System.out.println(list2);


    }
}
