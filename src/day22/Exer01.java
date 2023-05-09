package day22;

import java.io.File;

public class Exer01 {
    public static void main(String[] args) {
        // 创建一个与hello.txt在相同文件下的另一个名为abc.txt的文件
        File file1 = new File("hello.txt");
        System.out.println(file1.getAbsolutePath());
        // 获取file1的绝对路径
        System.out.println(file1.getAbsoluteFile().getParent());
        File file2 = new File(file1.getAbsoluteFile().getParent(), "abc.txt");
        System.out.println(file2.getAbsoluteFile());
    }
}
