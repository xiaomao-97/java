package day04;

public class SwitchCaseTest {
    public  static  void  main(String[] args){
        int number =2;
        switch (number){
            case 0:
                System.out.println("zero");

            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
