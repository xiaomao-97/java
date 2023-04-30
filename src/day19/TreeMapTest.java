package day19;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void  test() {
        // 自然排序
        TreeMap treeMap = new TreeMap();
        treeMap.put("CC",89);
        treeMap.put("AA",78);
        treeMap.put("JJ",65);
        treeMap.put("WW",78);
        Set entrySet = treeMap.entrySet();
        for(Object obj :entrySet){
            System.out.println(obj);
        }

    }

    // 自然排序
    @Test
    public void test1() {
        TreeMap treeMap = new TreeMap();
        User u1 = new User("tom", 23);
        User u2 = new User("jerry", 43);
        User u3 = new User("rose", 36);
        User u4 = new User("jack", 23);
        User u5 = new User("tony", 33);
        treeMap.put(u1, 78);
        treeMap.put(u2, 54);
        treeMap.put(u3, 45);
        treeMap.put(u4, 22);
        treeMap.put(u5, 73);


    }
    // 定制排序
    @Test
    public void test2() {
        Comparator  comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int value = u1.getName().compareTo(u2.getName());
                    if(value !=0){
                        return value;
                    }
                    return u1.getAge() - u2.getAge();
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        TreeMap treeMap = new TreeMap(comparator);
        User u1 = new User("tom", 23);
        User u2 = new User("jerry", 43);
        User u3 = new User("rose", 36);
        User u4 = new User("jack", 23);
        User u5 = new User("tony", 33);
        treeMap.put(u1, 78);
        treeMap.put(u2, 54);
        treeMap.put(u3, 45);
        treeMap.put(u4, 22);
        treeMap.put(u5, 73);
        System.out.println(treeMap);
    }
}
