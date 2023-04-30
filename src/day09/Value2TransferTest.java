package day09;

public class Value2TransferTest {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n= 20;
        System.out.println("m ="+data.m+",n="+data.n);
        Value2TransferTest value2TransferTest =  new Value2TransferTest();
        value2TransferTest.swap(data);
        System.out.println("m ="+data.m+",n="+data.n);

    }

    public void swap(Data data){
        int temp = data.m;
        data.m =data.n;
        data.n = temp;
    }
}

class  Data{
    int m;
    int n;
}
