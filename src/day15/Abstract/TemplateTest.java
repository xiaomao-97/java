package day15.Abstract;
//m模板方法
public class TemplateTest {
    public static void main(String[] args) {
        SubTemPlate subTemPlate = new SubTemPlate();
        subTemPlate.spendTime();
    }
}

abstract class Template{
    public  void spendTime(){
        long start = System.currentTimeMillis();
        code(); // 不确定方法，易变的方法
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start));
    }

    public abstract void code();
}

class SubTemPlate extends Template{
    @Override
    public void code() {
        for (int i = 2;i<=1000;i++){
            boolean isFlag = true;
            for(int j = 2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    boolean isFalg = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
