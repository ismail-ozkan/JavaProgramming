package Day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("----------------Push up started------------------");

        for (int i=1; i<=30; i++) {
            System.out.print("\rPush up "+i);

            sleep(1.5);
            /*try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }*/
            //waitForOneAdnAHalfSecond();
        }

        System.out.println("\n----------------Push up completed------------------");

        System.out.println("\n----------------Pull up started------------------");

        for (int i = 30; i >0 ; i--) {
            System.out.print("\rPull up "+i);

            sleep(2.5);
            /*try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("\n----------------Pull up completed------------------");
    }


    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));// casting data type double to long
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void waitForOneAdnAHalfSecond() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }



}
