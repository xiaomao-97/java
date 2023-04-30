package day08;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.age);
    }
}

class  User{
    // 成员变量
    String name;
    int age =1 ;
    boolean isMale;

    public void talk(String language){
        System.out.println("我们使用"+language+"进行交流");
    }

    public void eat(){
        String food = "烙饼";
        System.out.println("北方人喜欢吃："+food);
        }
}
