package day13.java2;

import org.junit.Test;

public class JunitTest {
    int num =10;

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
    }
}
