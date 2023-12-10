package chapter18.grammar;

import org.junit.Test;

import java.util.*;

public class VarTest {
     // 可以使用的场景
    @Test
    public void  test1(){
        // 局部变量实例化
        var list = new ArrayList<String>();
        var set = new LinkedHashSet<Integer>();

        // 增强for循环的索引
        for (var v:list){
            System.out.println(v);
        }

        // 传统for循环
        for(var i =0;i<100;i++){
            System.out.println(i);
        }

        // 返回值类型包含复杂泛型结构
        var iterator = set.iterator();

        HashMap<Object, Object> map = new HashMap<>();
        var entries = map.entrySet();

    }

}
