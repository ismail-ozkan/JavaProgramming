package day27_WrappeClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);//int

        System.out.println(num + 1);//124
        System.out.println(str + 1);//1231


        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);// double

        System.out.println(num2+1);//11.5
        System.out.println(str2 + 1);//10.51


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("maxLong = " + maxLong);


        String s1 = "true";
        String s2 = "maybe";
        boolean r1 = Boolean.parseBoolean(s1);// return primitive as a result
        boolean r2 = Boolean.parseBoolean(s2);//false as default

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        System.out.println("--------------------------");


        String st2 = "123";

        Integer x = Integer.valueOf(st2);
        System.out.println(x);
        int x1 = Integer.valueOf(st2);
        System.out.println("x1 = " + x1);

        String s3 = "1.3";
        double d3 = Double.parseDouble(s3);//  return Double as a result
        System.out.println(d3);



        char ch1 = 'A';

        //isDigit()
        boolean b1 = Character.isDigit(ch1);//boolean data type

        System.out.println(b1);

        //isLetter()
        boolean b2 = Character.isLetter(ch1);
        System.out.println(b2);

        //isLetterOrDigit()
        boolean b3 = !Character.isLetterOrDigit(ch1);// if is special character gets true
        System.out.println(b3);

        //isUpperCase()
        boolean b4 = Character.isUpperCase(ch1);
        System.out.println(b4);

        //isLowerCase()
        boolean b5 = Character.isLowerCase(ch1);
        System.out.println(b5);


        System.out.println("-------------------------------");

        String sent = "ab1cde2efg3hi4";
        int sum = 0;

        for (char each : sent.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }

}
