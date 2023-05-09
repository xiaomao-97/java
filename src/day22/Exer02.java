package day22;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

public class Exer02 {
    @Test
    public void test1(){
        File dir = new File("D:\\OneDrive\\图片");
        // 方式1
//        String[] listFiles = dir.list();
//        for(String s:listFiles){
//            if(s.endsWith(".jpg")){
//                System.out.println(s);
//            }
//        }
        // 方式2
        String[] list = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
        for(String s:list) {
            if (s.endsWith(".jpg")) {
                System.out.println(s);
            }


        }
    }
}
