package day05;

public class PrimeNumberTest2 {
    public  static void main(String[] args){
        long start = System.currentTimeMillis();
        label:for(int i=2;i<=100;i++) {
            // 优化2:对本身是质数的自然数是有用的
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;    //可以增加效率，只对本身非质数的自然数有效
                }
            }
            System.out.println(i);
            long end = System.currentTimeMillis();
        }
    }
}
