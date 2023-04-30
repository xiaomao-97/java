package day09;

public class RecursionTest {
    public static void main(String[] args) {
        int sum =0;
        for(int i =1;i<=100;i++){
            sum +=i;
        }
        System.out.println(sum);
        RecursionTest recursionTest =  new RecursionTest();
        int num = recursionTest.getSum(100);
        System.out.println(num);

        int value = recursionTest.f(10);
        System.out.println(value);

    }


    public int getSum(int n){
        if(n==1){
            return 1;
        }else{
            return n+getSum(n-1);
        }
    }

    // 已知有一个数列，f(0) =1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n大于0的整数，求f（10）
    public int f(int n){
        if (n==0){
            return  1;
        }else if(n==1){
            return 4;
        }else {
            return  2*f(n-1)+f(n-2);
        }
    }

    //斐波那数列f(n)=f(n-1)+f(n-2)

    //快排

    //汉诺塔

}
