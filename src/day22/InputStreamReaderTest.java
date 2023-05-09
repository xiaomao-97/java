package day22;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {
    @Test
    public void test() throws IOException {
        File file = new File("file_utf8.txt");
        // 创建流的对象
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // 显示的使用utf-8的字符集
        // 读入操作
        char[] cBuffer = new char[1024];
        int len;
        while((len=isr.read(cBuffer))!=-1){
            String str = new String(cBuffer, 0, len);
            System.out.print(str);
        }

    }

    // 将jdk文件改写成utf-8


    @Test
    public void test1() throws IOException {
        File file = new File("file_gdk.txt");
        File file2 = new File("file_gdk_toutf.txt");

        //造流
        FileInputStream fis = new FileInputStream(file);
        //对应的解码集
        InputStreamReader isr = new InputStreamReader(fis, "GBK");

        FileOutputStream fos = new FileOutputStream(file2);
        //参数2说明字符存储到文件中使用的编码集
        OutputStreamWriter oos = new OutputStreamWriter(fos, "utf-8");

        char[] cBuffer = new char[1024];
        int len;
        while((len=isr.read(cBuffer))!=-1){
            oos.write(cBuffer, 0, len);
        }
        System.out.print("操作完成");

        // 关闭资源
        oos.close();
        isr.close();
    }
}
