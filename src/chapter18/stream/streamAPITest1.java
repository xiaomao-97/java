package chapter18.stream;

import day21.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPITest1 {
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        stream.filter(age -> age.getAge() > 70).forEach(System.out::println);

        System.out.println("*******");
        // limit(n) --- 截断流，使其元素不超过给定数量
        Stream<Employee> stream1 = list.stream();
        stream1.limit(1).forEach(System.out::println);

        System.out.println("*******");
        // skip(n)---跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit
        Stream<Employee> stream2 = list.stream();
        stream2.skip(1).forEach(System.out::println);

        // distinct()---筛选，通过流中所生成元素的hashcode（）和equals去除重复元素
        list.add(new Employee("马云",1001));
        list.add(new Employee("马云",1001));
        System.out.println(list);
        System.out.println("*********");

        list.stream().distinct().forEach(System.out::println);
    }


    @Test
    public void test2(){
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        // 将list转换为大写
        list.stream().map(str ->str.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("*******");
        // 获取员工的姓名长度大于3的员工
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().filter(emp -> emp.getName().length() >3).forEach(System.out::println);

        // 获取员工的姓名长度大于3的员工的姓名
        employees.stream().filter(emp -> emp.getName().length() >2).map(emp -> emp.getName()).forEach(System.out::println);
        System.out.println("********");
//        employees.stream().map(emp -> emp.getName()).filter(emp -> emp.getName().length() >2).forEach(System.out::println);
        System.out.println("********");
        // 相当于方法引用的第三种方法
        employees.stream().filter(emp -> emp.getName().length() >2).map(Employee::getName).forEach(System.out::println);




    }


    @Test
    public void test3(){
        // 自然排序
        Integer[] arr = new Integer[]{345, 3, 64, 3, 46, 7, 3, 34, 65, 68};
        String[] arr1 = new String[]{"GG", "DD", "MM", "SS", "JJ"};

        Arrays.stream(arr).sorted().forEach(System.out::println);
        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr1).sorted().forEach(System.out::println);

        // 因为Emplyee没有实现Compareable接口，所以报错
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted().forEach(System.out::println);

        //定制化排序
        List<Employee> list = EmployeeData.getEmployees();
        list.stream().sorted((e1,e2) -> e1.getAge()-e2.getAge()).forEach(System.out::println);


        // 针对字符串从大到小排序
        Arrays.stream(arr1).sorted((s1,s2) -> s1.compareTo(s2)).forEach(System.out::println);

        Arrays.stream(arr1).sorted(String::compareTo).forEach(System.out::println);
    }





}
