package day16;

public class ErrorTest {
    public static void main(String[] args) {
        //栈溢出
//        main(args );
        // 堆溢出
        Integer[] arr  = new Integer[1024*1024*1024];
    }

}
