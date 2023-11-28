package chapter18.stream;


import day21.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamAPITest {
    // 创建stream方式1：通过集合
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        Stream<Employee> stream1 = list.parallelStream();

    }

    // 创建stream方式2：通过数组
    @Test
    public void test2(){
        Integer[] arr = new Integer[]{12,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);

        int[] arr1 = new int[]{12,3,3,4};
        IntStream stream1 = Arrays.stream(arr1);

    }

    // 创建stream方式3：通过stream的of()
    @Test
    public void test3(){
        Stream<String> aa = Stream.of("AA", "BB", "dd", "ss");

    }



}
