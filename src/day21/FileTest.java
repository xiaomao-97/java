package day21;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void test(){
        // public File(String parent,String child)
        // 参数1：一定是一个文件目录
        // 参数2：可以是一个文件，也可以是一个文件目录
        File file = new File("d:\\io", "abc.txt");
        File file1 = new File("abc", "a12");

        //public File(String parent,String child)
        // 参数1,：一定是一个文件目录
        // 参数2：可以是一个文件，也可以是一个文件目录
        File file3 = new File(file1, "ab.txt");


    }
}
