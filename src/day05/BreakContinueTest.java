package day05;

public class BreakContinueTest {
    public static  void main(String[] args){
        for (int i =1;i<=10;i++){
             if (i%4==0){
                 break;
             }
             System.out.println(i);
        }
        //****************
        label:for (int i =1;i <=4;i++){
            for (int j=1;j<=10;j++){
                if (j%4 ==0){
                    break label;
                }
                System.out.println(j);
            }
        }
        System.out.println();
    }
}
