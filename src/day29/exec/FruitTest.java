package day29.exec;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class FruitTest {
    @Test
    public void test1() throws  Exception{
        // 读取配置文件信息，获取全类名
        Properties properties = new Properties();
        File file = new File("E:\\个人学习\\java\\code\\mzhlearning\\src\\config.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String fruitName = properties.getProperty("fruitName");
        // 通过反射，创建全类名的类的实例
        Class<?> aClass = Class.forName(fruitName);
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Fruit fruit = (Fruit) declaredConstructor.newInstance();
        // 通过榨汁机的对象调用run（）
        Juicer juicer = new Juicer();
        juicer.run(fruit);


    }
}

