package day22;

import org.junit.Test;

import java.io.*;

public class ObjectInputOutputStreamTest {

    @Test
    public void test() throws IOException {
        File file = new File("Object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeUTF("江苏如此多娇");
        oos.flush();
        oos.close();
    }

    @Test
    public void test1() throws IOException {
        File file = new File("Object.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        String str1 = ois.readUTF();
        System.out.print(str1);
        ois.close();
    }
}
