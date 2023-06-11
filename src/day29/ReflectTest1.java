package day29;

import day29.example.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest1 {
    // 体会反射的动态性
    public Person getInstance() {
        return new Person();
    }

    public <T> T getInstance(String className) throws Exception {
        Class clazz = Class.forName(className);
        Constructor declaredConstructors = clazz.getDeclaredConstructor();
        declaredConstructors.setAccessible(true);
        return (T) declaredConstructors.newInstance();
    }

    @Test
    public void test1() throws Exception{
        Person p1 = getInstance();
        System.out.println(p1);
        // 体现了所谓的动态性
        String className = "day29.example.Person";
        Person per1 = getInstance(className);
        System.out.println(per1);

    }


    // 体会动态性

    public  Object invoke(String className,String methodName) throws  Exception{
        Class clazz = Class.forName(className);
        Constructor declaredConstructors = clazz.getDeclaredConstructor();
        declaredConstructors.setAccessible(true);

        Object obj = declaredConstructors.newInstance();

        // 获取类中指定方法
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(obj);
    }

    @Test
    public void test2() throws Exception {
        // 调用这个类的这个方法
        String className = "day29.example.Person";
        String methodName = "show";
        Object invoke;
        invoke = invoke(className, methodName);
        System.out.println(invoke);

    }

}
