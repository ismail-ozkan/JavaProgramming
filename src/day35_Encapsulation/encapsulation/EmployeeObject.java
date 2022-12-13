package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("Josh",'M',23,22000);
        e1.setAge(32);
        /* e1.setName("");
        System.out.println(e1.getName());
        e1.setAge(1);
        System.out.println(e1.getAge());*/
        System.out.println(e1);

        Employee e2 = new Employee("Aygun",'F',33,115000);

        e2.setSalary(e2.getSalary() + 15000);

        System.out.println(e2.getSalary());//130000
    }

}
