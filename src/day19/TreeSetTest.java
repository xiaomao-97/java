
package day19;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    // 自然排序
    @Test
    public void  test(){
        TreeSet treeSet = new TreeSet();
        treeSet.add("CC");
        treeSet.add("AA");
        treeSet.add("DD");
        treeSet.add("GG");
        treeSet.add("MM");

        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){{
            System.out.println(iterator.next());
        }}
    }

    // 自然排序
    @Test
    public void test1() {
        TreeSet set = new TreeSet();
        User u1 = new User("tom", 23);
        User u2 = new User("jerry", 43);
        User u3 = new User("rose", 36);
        User u4 = new User("jack", 23);
        User u5 = new User("tony", 33);
        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){{
            System.out.println(iterator.next());
        }}

    }


    @Test
    public void test2() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  User && o2 instanceof  User){
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    int value = user1.getName().compareTo(user2.getName());
                    if(value !=0){
                        return value;
                    }
                    return -(user1.getAge() - user2.getAge());
                }
                throw new RuntimeException("类型异常");
            }
        };
        TreeSet set = new TreeSet(comparator);
        User u1 = new User("tom", 23);
        User u2 = new User("jerry", 43);
        User u3 = new User("rose", 36);
        User u4 = new User("jack", 23);
        User u5 = new User("tony", 33);
        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){{
            System.out.println(iterator.next());
        }}

    }
}
