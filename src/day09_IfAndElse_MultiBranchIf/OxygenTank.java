package day09_IfAndElse_MultiBranchIf;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenLevel = 75;
        String message = "";

        if (oxygenLevel>=0 && oxygenLevel<=100){//pre-condition
            if (oxygenLevel>=90) {
                message = "Your tank is full";
            } else if (oxygenLevel>=80) {
                message = "Still okay";
            } else if (oxygenLevel>=70) {
                message = "Don't go too far";
            }  else if (oxygenLevel>=60) {
                message = "Don't go too far";
            } else if (oxygenLevel>=50){
                message = "Be careful now you at 50%";
            }
        }
        System.out.println(message);

    }

}
