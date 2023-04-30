package day12;

public class Cylinder extends  Circle {
    private  double length;

    public Cylinder(){
        this.length = 1.0;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolumn(){
        return Math.PI*getRadius()*getRadius()*getLength();
    }
}
