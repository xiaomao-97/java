package day10;

public class UserTest {
    public static void main(String[] args) {
        User user=  new User(2);
        user.setAge(3);
        System.out.println(user.age);
    }

}

class User{
    String name;
    int age = 1;

    public User(){

    }

    public void  setAge(int n){
        age = n;
    }

    public User(int a){
        age =a;
    }
}
