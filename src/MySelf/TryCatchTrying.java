package MySelf;

public class TryCatchTrying {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[22]);

        } catch (IndexOutOfBoundsException e){
            System.out.println("2. Catch Block");
        }  catch (Exception e) {
            System.out.println("Catch Block");
            System.out.println("-----------------");
            e.printStackTrace();
            System.out.println("-----------");
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Finally Block");
        }

        try {
            Thread.sleep(3000);
            System.out.println("Try block");

        } catch (InterruptedException e) {
            System.out.println("Catch block");
        }

    }

}
