package day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Exero2 {
    public static void main(String[] args) {
        ArrayList<Integer> objectArrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            int random = (int) (Math.random() * (99 - 0 + 1));
            objectArrayList.add(random);

        }
        for(Integer list:objectArrayList){
            System.out.println(list);
        }

        objectArrayList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return  value %2==0;
            }
        });
        System.out.println();
        Iterator<Integer> iterator = objectArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
