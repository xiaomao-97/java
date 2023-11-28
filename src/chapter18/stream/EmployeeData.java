package chapter18.stream;

import day21.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("马云",1001));
        list.add(new Employee("马化腾",251));
        return list;



    }

}
