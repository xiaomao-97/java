package day14;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("c1的id:"+c1.getId());
        System.out.println("c2的id:"+c2.getId());
        System.out.println("创建圆的个数为"+Circle.getTotal());
        Circle c3 = new Circle(3.4);
        System.out.println("c3的id:"+c3.getId());
        System.out.println("创建圆的个数为"+Circle.getTotal());


    }

}

class Circle {
    private double radius;
    private int id;

    public Circle() {
        id = init++;  //static声明的属性被所有对象共享
        total++;    //自动赋值
    }

    public Circle(double radius){
        this();
//        id = init++;  //static声明的属性被所有对象共享
//        total++;    //自动赋值
        this.radius = radius;
    }

    private static int total;
    private static int init = 1001;

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }
}
