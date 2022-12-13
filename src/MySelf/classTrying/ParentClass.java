package MySelf.classTrying;

public class ParentClass {

    // I have some common instance variable in this class
    // we use parent
    public String surName;

    public ParentClass(String surName) {
        System.out.println("Parent constructor is working");
        this.surName = surName;
    }

    public void getSurname(){
        System.out.println("getSurname() method is working");
        System.out.println(surName);
    }




}
