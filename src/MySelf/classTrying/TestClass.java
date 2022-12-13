package MySelf.classTrying;

public class TestClass {


    protected static void main(String[] args) {


        ChildClass child = new ChildClass("özkan", "ismail");

        System.out.println(child);

        System.out.println(child.name);
        System.out.println(child.surName);
        System.out.println("-------------------------");
        child.getName();
        child.getSurname();

    }

}
