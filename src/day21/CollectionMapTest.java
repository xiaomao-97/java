package day21;

import org.junit.Test;

import java.util.*;

public class CollectionMapTest {

    @Test
    public void test(){
        List list = new ArrayList();
        list.add(78);
        list.add(58);
        list.add(38);
        list.add(28);
    }

    @Test
    public void test1() {
        HashMap<String, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("rose", 67);
        objectObjectHashMap.put("jerry",77);
        objectObjectHashMap.put("Tom", 07);
//
        Set<Map.Entry<String, Integer>> entries = objectObjectHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entries.iterator();
//
//         JDK 10中
//        var entries = objectObjectHashMap.entrySet();
//        var entryIterator = entries.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+""+value);
        }
    }
}
