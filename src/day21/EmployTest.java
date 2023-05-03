package day21;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployTest {
    @Test
    public  void test1(){
        TreeSet<Employee> objects = new TreeSet<>();
        Employee e1 = new Employee("hanmeimei", 18, new MyDate(1998, 12, 21));
        Employee e2 = new Employee("zhaomeimei", 13, new MyDate(2005, 12, 21));
        Employee e3 = new Employee("xueimei", 10, new MyDate(2013, 12, 21));
        Employee e4 = new Employee("caoeimei", 28, new MyDate(1996, 12, 21));

        objects.add(e1);
        objects.add(e2);
        objects.add(e3);
        objects.add(e4);

        //遍历
        Iterator<Employee> iterator = objects.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        TreeSet<Employee> objectTreeSet = new TreeSet<>();
        Comparator<Employee> objectComparator = new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                int yeardistince = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if(yeardistince !=0){
                    return  yeardistince;
                }
                int monthDistince = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if(monthDistince !=0){
                    return  monthDistince;
                }
                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        };

        TreeSet<Employee> objects = new TreeSet<>(objectComparator);
        Employee e1 = new Employee("hanmeimei", 18, new MyDate(1998, 12, 21));
        Employee e2 = new Employee("zhaomeimei", 13, new MyDate(2005, 12, 21));
        Employee e3 = new Employee("xueimei", 10, new MyDate(2013, 12, 21));
        Employee e4 = new Employee("caoeimei", 28, new MyDate(1996, 12, 21));

        objects.add(e1);
        objects.add(e2);
        objects.add(e3);
        objects.add(e4);

        //遍历
        Iterator<Employee> iterator = objects.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
