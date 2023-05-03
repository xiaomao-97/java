package day19;

import java.util.*;

public class SingerTest {
    public static void main(String[] args) {
        HashMap singers = new HashMap();
        String singers1= "周杰伦";
        ArrayList songs = new ArrayList();
        songs.add("夜曲");
        songs.add("七里香");
        songs.add("稻香");
        songs.add("青花瓷");
        singers.put(singers1, songs);
        String singers2= "林俊杰";
        ArrayList songs2 = new ArrayList();
        songs2.add("江南");
        songs2.add("曹操");
        songs2.add("小酒窝");
        songs2.add("可惜没如果");
        singers.put(singers2, songs2);
        Set entrySet = singers.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("歌手"+entry.getKey());
            System.out.println("歌曲有"+entry.getValue());
        }



    }
}
