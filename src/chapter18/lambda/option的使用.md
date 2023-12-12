# 为什么需要optional类

# 如何实例化

static Optional of(T value) ：用来创建一个 Optional 实例，value 必须非
空
– static <T> Optional<T> ofNullable(T value) ：用来创建一个
Optional 实例，value 可能是空，也可能非空

# 常用方法

T orElse(T other)：orElse(T other) 与 ofNullable(T value)配合使用，如果
Optional 容器中非空，就返回所包装值，如果为空，就用 orElse(T other)other 指定的
默认值（备胎）代替