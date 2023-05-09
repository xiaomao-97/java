package day22;

import org.junit.Test;

import java.io.*;

public class BufferedStreamTest {
    // 使用bufferstream中复制图片
    @Test
    public  void test1(){
        File srcFile;
        File destFile;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            srcFile = new File("295.jpg");
            destFile = new File("296_copy.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1024];
            int len = 0; // 记录每次读入buffer的个数
            while((len= bis.read(buffer))!=-1){
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (bis!=null){
                    bis.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                if (bos!=null){
                    bos.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
