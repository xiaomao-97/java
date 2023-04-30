package day05;


import java.util.Scanner;
public class ForWhileTest {
    public  static  void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int positiveNumber = 0;
        int negativeNumber =0;
        while(true){
            int number = scanner.nextInt();
            if (number <0){
                positiveNumber ++;
            }else if(number>0){
                negativeNumber ++;
            }else {
                break;
            }

        }
        System.out.println("正数个数为"+positiveNumber);
        System.out.println("负数个数为"+negativeNumber);


        for(;;){
            int number = scanner.nextInt();
            if (number <0){
                positiveNumber ++;
            }else if(number>0){
                negativeNumber ++;
            }else {
                break;
            }
        }
        System.out.println("正数个数为"+positiveNumber);
        System.out.println("负数个数为"+negativeNumber);
    }

    //改写为for

}
