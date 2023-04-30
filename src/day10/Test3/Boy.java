package day10.Test3;

public class Boy {
    private String name;
    private int age;
    public Boy(String name,int age) {
        this.age = age;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if(this.age > 22){
            System.out.println("结婚吧");
        }else{
            System.out.println("想啥呢");
        }
    }
}
