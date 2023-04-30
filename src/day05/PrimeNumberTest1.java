package day05;

/**
 * 100以内是所有质数的输出
 * 只有1和他本身整除的自然数
 * 从2开始到这个数字-1结束为止，都不能被这个数字整除
 */
public class PrimeNumberTest1 {
    public  static void main(String[] args){
        boolean isFlag = true;  //标识i是否被j整除过
        long start = System.currentTimeMillis();
        for(int i=2;i<=100000;i++){
            // 优化2:对本身是质数的自然数是有用的
            for (int j =2;j<= Math.sqrt(i);j++){
                if (i%j == 0){
                    isFlag = false;   //认为他不是质数
                    break;    //可以增加效率，只对本身非质数的自然数有效
                }
            }
            if (isFlag == true){
                System.out.println(i);
            }
            isFlag = true; //需要重置  注意注意注意

        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为："+ (end - start));
    }
}
