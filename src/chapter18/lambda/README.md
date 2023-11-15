# lambda表达式的格式举例
->:lambda操作符或箭头操作符
->的左边：lambda形参列表，对应着重写的接口中的抽象方法的形参列表
->的右边：Lambda体，对应着接口的实现类要重写的方法的方法体

# lambda的本质
一方面，lambda表达式作为接口实现类的对象； ---》“万事万物是对象”
另一方面，lambda表达式是一个匿名的函数

可以说lambda表达式是一个对象


# 函数式接口
什么是函数式接口？为什么需要函数式接口？
如果接口只申明一个抽象方法，则此接口是函数式接口
因为只有给函数式接口提供实现类的对象时，我们才可以使用lambda表达式

# api中函数式接口所在的包
jdk8中声明的函数式接口都在java.util.function包下

# 常见的函数式接口
Consumer<T>    void accept(T,t)
Supplier<T>    T get()
Function<T,R>  R apply(T,t)
Predicate<T>   boolean test(T t)

# lambda表达式总结
-> 的左边：lambda形参列表，参数的类型都可以省略。如果形参只有一个，则一对（）也可以省略
-> 的右边：lambda体，对应着重写的方法的方法体。如果方法体中只有一行语句，则一对{}也可以省略。
    如果有return关键字，则一并省略