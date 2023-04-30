package day14.Final;

public class FinalTest {
    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;

    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    public FinalTest(int n){
        RIGHT = n;
    }

    public void show(){
        final int NUM = 10;  // 常亮
    }

    public void show(final  int num){
//        num = 10; 编译不通过
    }
}


