package day22;

import org.junit.Test;

import java.io.*;

public class FileStreamTest {


    @Test
    public void test(){
        File srcFile;
        File destFile;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            srcFile = new File("295.jpg");
             destFile = new File("295_copy.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int len = 0; // 记录每次读入buffer的个数
            while((len= fis.read(buffer))!=-1){
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fos!=null){
                    fos.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                if (fis!=null){
                    fis.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }







}
