package day14_String;

public class EmailDomain_Substring {

        public static void main(String[] args) {

                String email = "Cydeo.School@gmail.com";

                // domain:
                int beginningIndex = email.indexOf("@") + 1 ;
                int endingIndex = email.lastIndexOf(".");

                String domain = email.substring(beginningIndex, endingIndex);

                System.out.println("domain = " + domain);//gmail

                /* my solution
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your email address: ");
                String email = scan.nextLine();

                String domain = email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));

                System.out.println("domain = " + domain);
                */

                System.out.println("-----------------------------");

                String str1 = "Java is fun, Java is cool, I love Java";

                String s1;// Java is fun

                s1 = str1.substring(0, 10+1);

                System.out.println("s1 = " + s1);

                String s2;// Java is cool

                int beg = str1.indexOf(" J")+1;// because we find " " character's index
                int end = str1.lastIndexOf(",");

                s2 = str1.substring(beg, end);

                System.out.println("s2 = " + s2);


                String s3 = str1.substring(str1.indexOf("I"));

                System.out.println("s3 = " + s3);

        }



}
