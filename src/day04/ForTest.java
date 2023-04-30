package day04;

public class ForTest {
    public  static  void  main(String[] args){
        int a = 2;
//        System.out.println(PrimeNumberTest1.java++);
        int b = a++;
        System.out.println(b);

         for (int i =1;i<=5;i++){
             System.out.println("Hello World");
         }
         int sum =0;
         int count = 0;
         for (int i =1; i <=100;i++){
             if (i%2 ==0){
                 sum +=i;
                 count ++;
                 System.out.println(i);
             }
         }
         System.out.println("总和为"+sum);
         System.out.println("偶数的个数为："+count);
    }
}
