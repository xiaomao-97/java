package day08;

public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test exer3Test = new Exer3Test();
        exer3Test.method();
        int method1 = exer3Test.method1();
        System.out.println("面积为："+method1);
        int method2 = exer3Test.method2(12,10);
        System.out.println("面积为："+method2);
    }
    public void  method(){
        for(int i = 0;i<10;i++){
            for (int j =0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int method1(){
        for(int i = 0;i<10;i++){
            for (int j =0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }

    public int method2(int m ,int n){
        for(int i = 0;i<m;i++){
            for (int j =0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
