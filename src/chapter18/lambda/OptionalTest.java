package chapter18.lambda;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test(){
        String start = "迪丽热巴";
        System.out.println(start.toString());

        String st1 = "迪丽热巴";
        st1 = null;

        // 如何使用optional避免空指针的问题
        // 用来创建Optional的实例，value可能是空，可能是非空
        Optional<String> optional = Optional.ofNullable(start);


        // orElse(T other0 :如果optional实例内部value属性不为null，则返回value，如果value是null，则返回other
        String otherStar = "杨幂";
        String finalStar = optional.orElse(otherStar);

        System.out.println(finalStar.toString());


    }


    @Test
    public void test2(){
        String start = "迪丽热巴";
        Optional<String> optional = Optional.ofNullable(start);
        // 取出内部的value值
        System.out.println(optional.get());




    }





}
