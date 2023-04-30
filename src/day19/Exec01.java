package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exec01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(24);
        list.add(24);
        list.add(24);
        list.add(22);
        list.add(22);
        list.add(22);
        list.add(55);
        list.add(24);
        list.add(24);
        List newList = duplicateList(list);
        System.out.println(newList);
    }

    public static List duplicateList(List list){
        // 方式1
//        HashSet hashSet = new HashSet();
//        for(Object obj:list){
//            hashSet.add(obj);
//        }
//        List list1 = new ArrayList();
//        for(Object obj:hashSet){
//            list1.add(obj);
//        }
//        return list1;
        // 方式2
        HashSet hashSet = new HashSet(list);
        List list1 = new ArrayList(hashSet);
        return list1;
    }



}
