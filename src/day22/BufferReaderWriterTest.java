package day22;

import org.junit.Test;

import java.io.*;

public class BufferReaderWriterTest {
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));

        char[] cBuffer = new char[1024];
        int len;
        // 方法1
        while((len=br.read(cBuffer))!=-1){
            for(int i=0;i<len;i++){
                System.out.print(cBuffer[i]);
            }
            // 方法2
            String str = new String(cBuffer, 0, len);
            System.out.println(str);
        }
        br.close();
    }



    @Test
    public void test2() throws IOException {
        File file = new File("hello.txt");
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));

        char[] cBuffer = new char[1024];
        int len;
        // 方法1
//        while((len=br.read(cBuffer))!=-1){
//            // 方法1
//            for(int i=0;i<len;i++){
//                System.out.print(cBuffer[i]);
//            }
//            // 方法2
//            String str = new String(cBuffer, 0, len);
//            System.out.println(str);
//        }
        // 方法2
        // readline()：每次读取一行文本中的数据，返回的字符串是不包括换行符
        String data;
        while ((data = br.readLine())!=null){
            System.out.print(data+"\n");
        }
        br.close();
    }

    // 此处简写用来抛出异常，实际还是需要使用try---catch
    @Test
    public void test3() throws IOException {
        File file = new File("hello.txt");
        File file1 = new File("hello_copy1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file1));

        String data;
        while ((data = br.readLine())!=null){
            bw.write(data+'\n'); // 手动换行
            bw.newLine(); // 换行操作
            bw.close(); // 刷新的操作。每当调用此方法时候，就会主动将内存中的数据写出到磁盘中
        }

        bw.close();
        br.close();
    }
}
