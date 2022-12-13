package day11_Switch_ScannerIntro;

public class Grade2 {

    public static void main(String[] args) {

    char ch = 'A';
    String result = "";

    switch (ch) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
            result = "Passed";
            break;

        case 'F':
            result = "Failed";
            break;

        default:
            result = "Invalid";
            break;
    }

        System.out.println(result);

    }

}
