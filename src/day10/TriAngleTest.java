package day10;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(2.9);
        triAngle.setHeight(7.9);
        System.out.println("base:"+triAngle.getBase()+"height:"+ triAngle.getHeight());
        TriAngle triAngle1 = new TriAngle(2.3,4.5);
        System.out.println("base:"+triAngle1.getBase()+"height:"+ triAngle1.getHeight());


    }
}


class  TriAngle{
    private double base;
    private double height;


    public TriAngle(){

    }

    public  TriAngle(double b,double h){
        base = b;
        height = h;
    }

    public void setBase(double b){
        base = b;
    }

    public void setHeight(double h){
        height = h;
    }

    public  double  getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }
}
