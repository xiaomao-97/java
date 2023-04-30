package day13.exec1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.3);
        Circle circle1 = new Circle("white",2.0,2.3);
        System.out.println("颜色是否相等："+circle1.getColor().equals(circle.getColor()));
        System.out.println("半径是否相等："+circle1.equals(circle));
        System.out.println(circle1);
    }
}
