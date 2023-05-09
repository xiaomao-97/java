package day22;

import org.junit.Test;

import java.io.File;

public class Exer3 {
    @Test
    public void  test1(){
        File file = new File("E:\\个人学习\\java\\code\\mzhlearning\\src\\day21");
        printFileName(file);
    }

    public void  printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for(File f:files){
                printFileName(f);
            }
        }
    }


}
