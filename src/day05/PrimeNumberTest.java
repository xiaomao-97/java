package day05;

/**
 * 100以内是所有质数的输出
 * 只有1和他本身整除的自然数
 * 从2开始到这个数字-1结束为止，都不能被这个数字整除
 */
public class PrimeNumberTest {
    public  static void main(String[] args){
        boolean isFlag = true;  //标识i是否被j整除过
        for(int i=2;i<=100;i++){
            for (int j =2;j<=i-1;j++){
                if (i%j == 0){
                    isFlag = false;   //认为他不是质数
                }
            }
            if (isFlag == true){
                System.out.println(i);
            }
            isFlag = true; //需要重置  注意注意注意

        }

    }
}
