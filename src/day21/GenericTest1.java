package day21;

import org.junit.Test;

public class GenericTest1 {
    @Test
    public void test(){
        Object obj = null;
        String str = "AA";

        obj = str;   // 基于继承性的多态使用

        //2
        Object[] arr = null;
        String[] arr1 = null;
        arr = arr1;  //基于继承性的多态的使用
    }

    @Test
    public void test1() {
        
//        ArrayList<Object> list1 = null;
//        ArrayList<String> list2 = null;
//        list1 = list2;    //失败
//

    }



}
