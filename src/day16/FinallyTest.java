package day16;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {

    @Test
    public void test4(){
        FileInputStream fis = null;
        try{
            
            File file  = new File("D:\\hello.txt");
            fis = new FileInputStream(file);
            int data = fis.read();
            while(data != -1){
                System.out.println((char)data);
                data = fis.read();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (fis != null){
                    fis.close();   //可能会报空指针
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
