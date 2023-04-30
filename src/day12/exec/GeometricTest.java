package day12.exec;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle(2.3,"white",1.0);
        test.displayGeometriObject(c1);
        Circle c2 = new Circle(2.3,"white",1.0);
        test.displayGeometriObject(c2);
        test.equalsArea(c1,c2);
        boolean isEquals = test.equalsArea(c1,c2);
        System.out.println("c1和c2的面积是否相同"+isEquals);

    }
    public  boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea()==o2.findArea();
    }

    public void displayGeometriObject(GeometricObject o){
        System.out.println("面积为："+o.findArea());
    }
}