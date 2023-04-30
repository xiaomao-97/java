package day08;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius =2.1;
        double area = circle.findArea();
        System.out.println(area);
    }
}

class Circle{
    double radius;

    public double findArea(){
        double area = Math.PI*radius*radius;
        return  area;
    }


}
