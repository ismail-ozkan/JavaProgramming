package day21_ForEachLoop.Tasks;

public class T6 {
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */
    public static void main(String[] args) {


        String str = "java , python, java , python, java , python, java , python, java , python, java , python";
        String[] arrStr = str.split(" ");
        int pCount = 0;
        int jCount = 0;
        for (String s : arrStr) {
            if (s.contains("python")) pCount++;
            if (s.contains("java")) jCount++;
        }

        System.out.println("pCount = " + pCount);
        System.out.println("jCount = " + jCount);

    }

}
