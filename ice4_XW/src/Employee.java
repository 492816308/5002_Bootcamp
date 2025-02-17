import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private double empPay;

    public Employee(String fName, String lName, double pay) {
        firstName = fName;
        lastName = lName;
        empPay = pay;
    }

    public Employee(Employee emp2) {
        firstName = emp2.firstName;
        lastName = emp2.lastName;
        empPay = emp2.empPay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getEmpPay() {
        return empPay;
    }

    public String toString() {
        // Create a string describing the name of the employee.
        return "First Name: " + firstName +
               "\nLast Name: " + lastName +
               "\nEmployee Pay: " + empPay;
    }

    public boolean equals(Employee emp) {
        boolean result;
        if (firstName.equals(emp.getFirstName()) && lastName.equals(emp.getLastName())
            && empPay == emp.getEmpPay()) {
            result = true;
        }

        else result = false;
        return result;
    }
}