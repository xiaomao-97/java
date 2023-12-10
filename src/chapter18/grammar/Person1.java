package chapter18.grammar;

public sealed class Person1  permits Student,Teacher,Worker{


}

// 要求指定的子类必须是final、sealed、non-sealed
final class Student extends  Person1{
    // 不可以被继承了
}


sealed class Teacher extends  Person1 permits  Senior{
    // 只可以被子类继承
}


non-sealed class  Worker extends  Person1{
    // worker 类继承时候，没有任何限制
}

non-sealed  class Senior extends Teacher{

}