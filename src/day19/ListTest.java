package day19;

import org.junit.Test;

import java.util.*;

public class ListTest {
    @Test
    public void test(){
        List list = new ArrayList();
        list.add("AA");
        list.add(123);  //自动装箱
        list.add("BB");
        System.out.println(list);

        list.add(2, "CC");
        System.out.println(list);

        // addAll和add不相同
        List list1 = Arrays.asList(1,2,3);
        list.addAll(1,list1);
    }


    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add(123);  //自动装箱
        list.add("BB");
        list.add(2);
        System.out.println(list);

        // 删除索引2的元素
        list.remove(2);
        System.out.println(list);

        // 删除数据2
        list.remove(Integer.valueOf(2));
        System.out.println(list);

    }


    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add(123);  //自动装箱
        list.add("BB");
        list.add(2);
        System.out.println(list);

        //遍历方式1，使用迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 遍历集合中学生信息
        for(Object obj:list){
            System.out.println(obj);
        }
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test3(){
        List list = new ArrayList();
        for(int i=0;i<30;i++){
            // 注意此处为0
            list.add((char)Math.random()*((122-97+1)+97)+"");
        }
        System.out.println(list);

        int a = listTest(list, "a");
        int b = listTest(list, "b");
        int c = listTest(list, "c");
        int x = listTest(list, "d");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("x:"+x);

    }

    public  static int listTest(Collection list, String s){
        int count = 0;
        for(Object obj:list){
            if(s.equals(obj)){
                count++;
            }
        }
        return count;
    }



}
