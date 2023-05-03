package day19;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {
    @Test
    public  void test1(){
        List list = Arrays.asList(4543, 65, 6, 4, 2, 32, 45, 56, 34 , 23);
        System.out.println(list);
        // 反转
        Collections.reverse(list);
        //随机排序
        Collections.shuffle(list);
        // 自然排序  sort
        Collections.sort(list);
        System.out.println(list);
        // 定制排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  Integer && o2 instanceof  Integer){
                    Integer i1 = (Integer) o1;
                    Integer i2 =(Integer) o2;
                    // 主动拆箱
                    return -(i1.intValue() - i2.intValue());
                }
                throw new RuntimeException("类型不匹配");
            }
        });

    }

    @Test
    public void test2() {
        List list = Arrays.asList(45, 65, 6, 4, 2, 32, 45, 56, 34 , 23);
        System.out.println(list);
        Comparable max = Collections.max(list);
        System.out.println(max);

        int frequency = Collections.frequency(list, 45);
        System.out.println("frequency"+frequency);
    }

    @Test
    public void test3() {
        List list = Arrays.asList(45, 65, 6, 4, 2, 32, 45, 56, 34 , 23);
        // 错误的写法
//        List dest = new ArrayList();
        // 正确
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest, list);
        System.out.println(dest);
    }

    @Test
    public void test4() {
        List list1 = new ArrayList<>();
        List list = Collections.synchronizedList(list1);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(objectObjectHashMap);

    }
}
