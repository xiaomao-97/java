package day09;

public class Value1TransferTest {
    public static void main(String[] args) {
        int m  =10;
        int n = 20;
        System.out.println("m="+m+",n="+n);

//        int temp = m;
//        m =n;
//        n =temp;
        Value1TransferTest value1TransferTest = new Value1TransferTest();
        value1TransferTest.swap(m , n);
        System.out.println("m="+m+",n="+n);
    }

    public void  swap(int m ,int n){
        int temp = m;
        m =n;
        n =temp;
    }
}
