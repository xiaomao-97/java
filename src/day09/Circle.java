package day09;

public class Circle {
    double radius;

    public  double findArea(){
        return Math.PI * radius * radius;
    }
}


class PaasObject{
    public static void main(String[] args) {
        PaasObject paasObject = new PaasObject();
        Circle c = new Circle();
        paasObject.printAreas(c,5);
    }


    public void printAreas(Circle c,int time){
        System.out.println("Radius");
        for (int i = 1;i<=time;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t"+c.findArea());
        }
    }
}
