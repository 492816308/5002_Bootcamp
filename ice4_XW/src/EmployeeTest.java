
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("James", "Bond", 4500.45);
        // To string method
        System.out.println("Employee 1: \n" + employee1);

        System.out.println();

        Employee employee2 = new Employee(employee1);

        System.out.println("Employee 2: \n" + employee2);


        if (employee2.equals(employee1)) {
            System.out.println("\nThe employee1 and employee2 " +
                               "variables reference the same object.");
        }
        else {
            System.out.println("\nThe employee1 and employee2 " +
                               "variables reference different objects.");
        }
    }
}
