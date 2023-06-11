package day29;

import day29.example.Person;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    // 使用反射之前
    @Test
    public  void  test(){

        Person p1 = new Person();

        //調用屬性
        p1.age = 10;
        System.out.print(p1.age);
        //調用方法
        p1.show();

    }

    // 使用反射完成上述操作呢


    @Test
    public void test1() throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        Class<Person> clazz =Person.class;
        Person p1;
        p1 = (Person) clazz.newInstance();    // 造对象
        // 調用屬性
        Field age;
        age = clazz.getField("age");
        age.set(p1, 10);
        System.out.print(age.get(p1));
        //調用方法
        Method show = clazz.getMethod("show");
        Object invoke = show.invoke(p1);
    }

    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 調用私有的構造器
        Class clazz = Person.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Person P1 = (Person) declaredConstructor.newInstance("Tom", 12); // 造对象
        System.out.print(P1);

        // 調用私有的屬性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(P1, "jerry");
        System.out.print(name.get(P1));

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String info = (String) showNation.invoke(P1, "CHN");
        System.out.print(info);



    }

    @Test
    public void test22() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 调用静态的属性

        Class clazz = Person.class;
        Field name = clazz.getDeclaredField("info");
        name.setAccessible(true);
        System.out.print(name.get(clazz));
    }

    @Test
    public void test23() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 调用静态的属性

        Class clazz = Person.class;
        Object o = clazz.newInstance();
        Person per = (Person) clazz.newInstance();
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        // 通过invoke的返回值就是Method的返回值
        Object chn = showNation.invoke(per, "CHN");
        System.out.println(chn);

    }

    @Test
    public void test24() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 调用静态的属性

        Class clazz = Person.class;
        Method showNation = clazz.getDeclaredMethod("showInfo");
        showNation.setAccessible(true);
        // 通过invoke的返回值就是Method的返回值
        Object chn = showNation.invoke(null);
        System.out.println(chn);

    }



    @Test
    public void test3() throws ClassNotFoundException {
        Class  clazz1 =Person.class;
        System.out.print(clazz1);

        Person person = new Person();
        Class  clazz2 =person.getClass();

        String name = "day29.example.Person";
        Class clazz3 = Class.forName(name);

        Class clazz4 = ClassLoader.getSystemClassLoader().loadClass(name);
        System.out.print(clazz4==clazz1);
    }

    @Test
    public void test4() throws IOException {
        Properties properties = new Properties();
        FileInputStream is = new FileInputStream(new File("info.properties"));
        properties.load(is);
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        System.out.println(name+""+age);
    }


    @Test
    public void test5() throws IOException {
        Properties properties = new Properties();
        // 通过类的加载的读取文件的默认路径是，当前module的src下面
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        properties.load(is);
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        System.out.println(name+""+age);
    }


}
