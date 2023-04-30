package day05;

public class ForTest1 {
    public static  void main(String[] args){
        int a;
        for (a=100;a<1000;a++){
            int b = a /100;
            int c = a%100/10;
            int d = a%10;
            if (a==b*b*b+c*c*c+d*d*d){
                System.out.println("水仙数字为："+a);
            }
        }
    }

}
