package x_adam_only.week09;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 13;
        System.out.println(isPrime(num));

    }

    public static String isPrime(int num){
        String result = "It is prime";
        if (num<2) {
            result = "It is not prime";
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                result = "It is not prime";
            }
        }
        return result;
    }


/*
if (num>1){
        int counter = 0;
            for (int i = 2; i <= num; i++) {
                if (num%i==0) {
                    counter++;
                }
            }
            if (counter==1){
                System.out.println("It is prime number");
            }else {
                System.out.println("counter = " + counter);
                System.out.println("It is not prime number");
            }
        } else {
            System.out.println("It is not prime number");
        }
 */
}
/*
        Task 2 :   Write a method that can check if a number is prime or not
				Note : Prime numbers are special numbers, greater than 1, that have exactly two factors,
				 themselves and 1
				7
			is divisible by	 2
			""	             3
			""	             4
			""	             5
	        ""	             6
         */
