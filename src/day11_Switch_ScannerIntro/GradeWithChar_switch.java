package day11_Switch_ScannerIntro;

public class GradeWithChar_switch {

    public static void main(String[] args) {


        char ch = 'A';

        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
