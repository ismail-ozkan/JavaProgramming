package MySelf.classTrying;

public class ChildClass extends ParentClass {

    public String name;

    public ChildClass(String surName, String name) {
        super(surName);
        System.out.println("ChildClass constructor is working");
        this.name = name;
    }

    public void getName(){
        System.out.println("getName() method is working");
        System.out.println(name);
    }

    public String toString() {
        return "ChildClass{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
