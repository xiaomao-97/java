package day12;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.1);
        cylinder.setLength(3.4);
        double volumn = cylinder.findVolumn();
        System.out.println("圆柱的体积"+volumn);

        double area  = cylinder.findArea();
        System.out.println("圆柱的面积"+area);
    }
}
