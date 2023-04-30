package day10;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "huahua";
        animal.age =1;
        animal.legs =4;
        animal.setLegs(7);
        animal.show();
        animal.setLegs(6);
        animal.show();
    }
}

class Animal{
    String name;
    int age;
    int legs;

    public  void  eat(){
        System.out.println("动物进食");
    }

    public void setLegs(int l){
        if(l>=0&& l%2==0){
            legs = l;
        }else{
            legs = 0;
        }
    }

    public int getLegs(){
        return legs;
    }

    public void show(){
        System.out.println("name="+name+",age="+age+",legs="+legs);
    }
}
