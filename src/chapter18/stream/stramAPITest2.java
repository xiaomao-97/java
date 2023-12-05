package chapter18.stream;

import day21.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stramAPITest2 {


    //终止操作

    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().allMatch(emp -> emp.getAge() > 268));

        System.out.println(employees.stream().anyMatch(emp -> emp.getAge() > 18));

        //findFirst返回第一个元素
        System.out.println(employees.stream().findFirst().get());

        // 针对于集合，jdk8增加了一个遍历的方法
        employees.forEach(System.out::println);

        // 针对于List来说，遍历的方式 1、使用iterator 2、增强for 3、一般for 4、 for each（）
    }


    @Test
    public void test2(){
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().count());

        System.out.println(employees.stream().filter(emp -> emp.getAge() >18).count());

        System.out.println(employees.stream().max((e1, e2) -> Double.compare(e1.getAge(), e2.getAge())));


        // 返回最高的年纪
        // 方式1
        System.out.println(employees.stream().map(emp -> emp.getAge()).max((e11, e22) -> Double.compare(e11, e22)).get());
        // 方式2
        System.out.println(employees.stream().max((e11, e22) -> Double.compare(e11.getAge(), e22.getAge())).get().getAge());

        System.out.println(employees.stream().map(emp -> emp.getAge()).max(Double::compare).get()  )  ;



        // 返回最小的年纪
        System.out.println(employees.stream().map(emp -> emp.getAge()).min(Double::compare).get()  )  ;

        //for each ---内部迭代


//        System.out.println(employees.stream().anyMatch(emp -> emp.getAge() > 18));
//
//        //findFirst返回第一个元素
//        System.out.println(employees.stream().findFirst().get());
    }

    //归约
    @Test
    public void test3(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().reduce(0,(x1,x2) -> x1+x2));
        System.out.println(list.stream().reduce(10,(x1,x2) -> x1+x2));


        System.out.println(list.stream().reduce(10,(x1,x2) -> Integer.sum(x1,x2)));

        System.out.println(list.stream().reduce(0,Integer::sum));

        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().map(employee -> employee.getAge()).reduce((s1, s2) -> Integer.sum(s1, s2)));
    }


    @Test
    public void test4(){
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> collect = employees.stream().filter(employee -> employee.getAge() > 256).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println();
        employees.forEach(System.out::println);

        System.out.println();

        // 按照员工年龄进行排序
        List<Employee> collect1 = employees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }






}
