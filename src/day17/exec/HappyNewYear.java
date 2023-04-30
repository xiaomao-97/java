package day17.exec;

public class HappyNewYear {
    public static void main(String[] args) {
        for(int i=10;i>=0;i--){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i==0){
                System.out.println("happy new year");
            }
            if(i>0) {
                System.out.println(i);
            }
        }
    }
}
