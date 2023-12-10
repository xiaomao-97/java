package chapter18.grammar;

import org.junit.Test;

import static java.awt.SystemColor.info;

public class BlockTest
{

    @Test
    public void test1(){
        String info = "<html>\n" +
                "   <body>\n" +
                "       <p>Hello,尚硅谷</p>\n" +
                "   </body>\n" +
                "</html>";
        System.out.println(info);

        String info1 ="<html>\n" +
                "   <body>\n" +
                "       <p>Hello,尚硅谷</p>\n" +
                "   </body>\n" +
                "</html>";
        System.out.println(info1);

    }

    @Test
    public void test2(){
        String info = """
                <html>
                    <body>
                        <p>hello,尚硅谷</p>
                    <body>
                </html>
                """;
        System.out.println(info);
    }

    @Test
    public void test3(){

        String myJson = "{\n" +
                " \"name\":\"Song Hongkang\",\n" +
                " \"address\":\"www.atguigu.com\",\n" +
                " \"email\":\"shkstart@126.com\"\n" +
                "}";

        System.out.println(myJson);
    }

    @Test
    public void test4(){
       String myJson = """
               {
                 "name": "Song HongKang",
                 "gender": "男",
                 "address": "www.atguigu.com"
               }
               """;
        System.out.println(myJson);
    }

    @Test
    public void test5(){
        String myJson =  "SELECT id,NAME,email\n" +
                "FROM customers\n" +
                "WHERE id > 4\n" +
                "ORDER BY email DESC";
        ;
        System.out.println(myJson);
    }

    @Test
    public void test6(){
        String myJson =  """
             SELECT id,NAME,email
             FROM customers
             WHERE id > 4
             ORDER BY email DESC
             """;
    }

    // JDK14x新特性  \表示取消换行的操作 \s表示一个空格
    @Test
    public void test7(){
        String myJson =  """
             SELECT id,NAME,email  \
             FROM customers
             WHERE id > 4 \
             ORDER BY email DESC
             """;
    }

}
