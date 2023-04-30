package day15;

public class InnerClassTest1 {
    public void method(){
        class AA{

        }
    }

    // 返回一个实现了comparable接口的类的对象
    //
    public Comparable getComparable(){
        // 方式1
//        class MyComparable implements  Comparable{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return  new MyComparable();
        // 方式2
        return  new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
