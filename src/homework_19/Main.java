package homework_19;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee = new Employee("Victor", 226655, 15000);
        System.out.println(employee);
        System.out.println();

        File employeeFile = new File("Employee.txt");
        Methods.serialize(employee, employeeFile);
        Employee obj = (Employee) Methods.deserialize(employeeFile);
        System.out.println(obj);

        System.out.println();

        File employeeArray = new File("EmployeeArray.txt");
        List<Employee> array = new ArrayList<Employee>();
        array.add(employee);
        array.add(new Employee("Sasha", 654987, 25000));
        array.add(new Employee("Olena", 154287, 21500));
        array.add(new Employee("Nazar", 123456, 45000));
        System.out.println("Employees are:");
        for (Employee empl : array) {
            System.out.println(empl);
        }
        System.out.println();

        Methods.serialize((Serializable) array, employeeArray);
        Methods.deserialize(employeeArray);

        System.out.println("Array list after serialization and deserialization:");
        for (Employee empl : array) {
            System.out.println(empl);
        }

    }
}
