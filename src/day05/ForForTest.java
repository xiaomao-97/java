package day05;

public class ForForTest {
    public  static  void  main(String[] args){
        /**
         * *
         * **
         * ***
         * ****
         */
         for (int j =1;j<=4;j++){
             for (int i=1;i<=j;i++){
                 System.out.print("*"); //输出
             }
             System.out.println();   //换行
         }

        /**
         * ****
         * ***
         * **
         * *
         */
        for(int j = 1;j<=4;j++){
            for (int i=1;i<=5-j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
