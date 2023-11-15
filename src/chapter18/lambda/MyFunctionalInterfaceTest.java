package chapter18.lambda;

import org.junit.Test;

public class MyFunctionalInterfaceTest {
    @Test
    public void test1(){
        MyFunctionInterface  m = ()->System.out.println("hello");
        m.method();
    }

}
