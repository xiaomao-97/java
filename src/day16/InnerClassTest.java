package day16;


// 在局部内部类的方法中，（比如，show如果调用局部内部类所声明的方法（比如method）中的局部变量（比如num）的话，要求此局部变量申明为final
public class InnerClassTest {
    public void method(){
        int num  =10;
        class AA{
            public void show(){
                System.out.println(num);
            }
        }
    }
}
