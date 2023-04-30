package day05;

/**
 * 求两个正整数的最大公约数和最小公倍数
 */
import java.util.Scanner;
public class ForTest {
    public  static  void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int m = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int n = scanner.nextInt();

        // 最大公约数的计算
        int min = (m<n)?m:n;
        for (int i = min;i>1;i--){
            if (m%i==0 && n %i==0){
                System.out.println("最小公约数："+i);
                break;   // 寻找出最大公约数
            }
        }

        // 最大公倍数的计算
        int max = (m>n)?m:n;
        for (int i = max ;i<=m*n;i++){
            if (i%m==0 && i%n==0){
                System.out.println("最小公倍数："+i);
                break;
            }
        }



    }
}
