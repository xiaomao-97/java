package day10.Test3;

public class Girl {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }



    public Girl(String name,int age) {
        this.name = name;
        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小,比较当前对象和形参对象
     * @param girl
     * @return
     */
    public int compare(Girl girl){
        if(this.age >girl.age){
            return 1;
        }else {
            return 0;
        }
    }
}
