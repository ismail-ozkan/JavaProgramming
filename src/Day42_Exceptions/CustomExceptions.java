package Day42_Exceptions;

class FadyException extends RuntimeException { // custom unchecked exception

    public FadyException() {
        System.err.println("It's time for break");
    }

    public FadyException(String message) {
        super("Time is for a short break");
    }
}

class NoBreakException extends Exception { // custom checked exception

}
public class CustomExceptions{

    public static void main(String[] args) {

       // throw new FadyException();
        //throw new FadyException("It's time for break");

        try {
            throw new NoBreakException();// it is checked exception
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }

}
