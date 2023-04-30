package day19;

import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void test(){
        Map map = new HashMap<>();
        map.put(null, null);
        System.out.println(map);
    }

    @Test
    public void test4() {
        HashMap map = new HashMap();
        // 添加
        map.put("AA", 56);
        map.put(67, "TOm");
        map.put("BB", 78);
        map.put(new Person("jerry",23), 56);
        System.out.println(map);
        System.out.println(map.size());
        // 删除
        Object value = map.remove("AA");
        System.out.println(map);
        // 修改
        Object oldValue = map.put("BB", 99);
        System.out.println(map);
    }

    @Test
    public void test5(){
        HashMap map = new HashMap();
        // 添加
        map.put("AA", 56);
        map.put(67, "TOm");
        map.put("BB", 78);
        map.put(new Person("jerry",23), 56);
        Set set = map.keySet();
        // 使用迭代器,遍历key
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){{
            Object key = iterator.next();
            System.out.println(key);
        }}
        // 使用迭代器，遍历value
        Collection values = map.values();
        for(Object obj:values){
            System.out.println(obj);
        }
    }

    @Test
    public void test6() {
        HashMap map = new HashMap();
        map.put("AA", 56);
        map.put(67, "TOm");
        map.put("BB", 78);
        map.put(new Person("jerry",23), 56);
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
//            Object obj = iterator.hasNext();
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+"--------"+entry.getValue());


        }

    }
}
