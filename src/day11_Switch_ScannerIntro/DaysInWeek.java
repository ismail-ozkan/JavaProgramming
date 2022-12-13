package day11_Switch_ScannerIntro;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 8;
        boolean a;

        switch (number) {//1,2,3,4,5,6,7. == we only use switch for only comparing equality(==) (NOT use < > >= <= =!...)

            case 1:        // data in here  is compared to data in switch statement(they must be same data type)
                System.out.println("Monday");
                break;// we need this statement for continuing

            case 2: // case value must be unique
                System.out.println("Tuesday");
                break;// exist the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default: // only get executed if none of the case blocks are matching and we can place default block anwhere in switch block
                System.out.println("Invalid");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;


        }




    }
}
