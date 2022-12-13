package MySelf;

public class NumberFromName {

    public static void main(String[] args) {

        System.out.println(numberOfName("ismail özkan"));
        System.out.println(numberOfName("kübra özkan"));
        System.out.println(numberOfName("kübra koç"));
        System.out.println(numberOfName("taha kerem özkan"));
        System.out.println(numberOfName("rabia özkan"));
        System.out.println(numberOfName("özkan"));
        System.out.println(numberOfName("nihad özkan"));
        System.out.println(numberOfName("hatice özkan"));
        System.out.println(numberOfName("yusuf cihad özkan"));
        System.out.println(numberOfName("yusuf ensar özkan"));
    }

    public static int numberOfName(String fullName) {

        int sum = 0;
        String[] arr = fullName.split(" ");

        for (String each : arr) {
            char[] chars = each.toCharArray();
            for (char e : chars) {
                sum+=e;
            }
        }

        return sum;
    }

}
