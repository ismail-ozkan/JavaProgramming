package day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("ismail");
        Employee employee2 = new Employee("Ahmet",'M');
        Employee employee3 = new Employee("Frema",'F',"SDET");



        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }

}
