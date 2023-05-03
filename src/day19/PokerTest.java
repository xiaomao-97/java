package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PokerTest {
    public static void main(String[] args) {
        // 组成一副扑克牌
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"黑桃","方块","红桃","梅花"};
        ArrayList poker = new ArrayList();
        for(int i=0;i< color.length;i++){
            for(int j =0;j <num.length;j++){
                poker.add(color[i] + " " + num[j]);
            }
        }
        poker.add("小王");
        poker.add("大王");

        // 洗牌
        Collections.shuffle(poker);

        // 发牌
        ArrayList me = new ArrayList();
        ArrayList Tom = new ArrayList();
        ArrayList jerry = new ArrayList();
        ArrayList lastCards = new ArrayList();
        for(int i=0;i<poker.size();i++){
            if(i >=poker.size()-3){
                lastCards.add(poker.get(i));
            }else if(i%3==0){
                me.add(poker.get(i));
            } else if (i%3==1) {
                Tom.add(poker.get(i));
            } else if (i%3==2) {
                jerry.add(poker.get(i));

            }
        }

        System.out.println(me);
        System.out.println(Tom);
        System.out.println(jerry);
        System.out.println(lastCards);



    }
}
