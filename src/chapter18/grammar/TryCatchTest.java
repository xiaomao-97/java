package chapter18.grammar;

import org.junit.Test;

import java.io.*;

public class TryCatchTest {

    //jdk7之前
    @Test
    public void test01()  {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter("test.txt");
            bw = new BufferedWriter(fw);
            bw.write("hello");

        }catch(IOException e){
            e.printStackTrace();

        }finally{
            try {
                if(bw!=null){
                    bw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //jdk7
    @Test
    public void test02()  {
        try(  FileWriter fw= new FileWriter("test.txt");
             BufferedWriter bw = new BufferedWriter(fw);
             ){
            bw.write("hello");
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    @Test
    public void test03()  {
        try (
                FileInputStream fis = new FileInputStream("test.txt");
                InputStreamReader isr = new InputStreamReader(fis, "utf-8");
                BufferedReader br = new BufferedReader(isr);
                FileOutputStream fos = new FileOutputStream("abc.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
                BufferedWriter bw = new BufferedWriter(osw);
        ){
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        }catch (IOException e){
                e.printStackTrace();
        }
        }


    @Test
    public void test04()  {
        BufferedReader  br = null;
        BufferedWriter bw = null;
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            br = new BufferedReader(isr);
            FileOutputStream fos = new FileOutputStream("abc.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
            bw = new BufferedWriter(osw);
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(bw != null){
                    bw.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(br!=null)
                    br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test05()  {
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try (reader;writer){


        }catch (IOException e){
            e.printStackTrace();
        }
    }








}
