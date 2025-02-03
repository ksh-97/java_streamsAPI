package collection.list;

import java.util.ArrayList;
import java.util.List;

public class employee_impl {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Ksh", 5000, 200));

        System.out.println(employees);

    }
}
