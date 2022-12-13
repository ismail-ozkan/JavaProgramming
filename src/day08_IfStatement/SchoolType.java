package day08_IfStatement;

public class SchoolType {

    public static void main(String[] args) {

        byte givenNumber = 13;

        boolean isElementary = givenNumber >=1 && givenNumber <=5;
        boolean isMiddle = givenNumber >=6 && givenNumber <=8;
        boolean isHİgh = givenNumber >=9 && givenNumber <=12;
        boolean isCollege = givenNumber >=13 && givenNumber <=16;
        boolean isGrad = givenNumber >=17 && givenNumber <=18;

        if (isElementary){
            System.out.println("School type is Elementary School");
        } else if (isMiddle) {
            System.out.println("School type is Middle School");
        } else if (isHİgh) {
            System.out.println("School type is High School");
        } else if (isCollege) {
            System.out.println("School type is College");
        } else if (isGrad) {
            System.out.println("School type is Middle School");
        } else {
            System.out.println("Invalid value is entered!");
        }
    }
}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */