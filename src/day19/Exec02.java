package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exec02 {
    public static void main(String[] args) {
        Set set = new HashSet();
        while (set.size()<10){
            int v = (int)(Math.random() * (20 - 1 + 1) + 1);
            set.add(v);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() );
        }

    }
}
