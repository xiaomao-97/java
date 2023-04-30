package day13.exec1;

import java.util.Objects;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
        radius = 1.0;

    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14*radius*radius;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }
        if (o instanceof  Circle){
            Circle circle = (Circle) o;
            return this.radius== circle.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
