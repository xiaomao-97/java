package day21.exer1;

import java.util.*;

public class DAO<T> {
    Map<String,T> map= new HashMap<>() ;
//
//    {
//        map = new HashMap<>();
//    }

    public void save(String id,T entity){
        if (!map.containsKey(id)){
            map.put(id, entity);
        }
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        if (map.containsKey(id)){
            map.put(id, entity);
        }
    }

    public List<T> list(){
        // 方式1
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>();
        list.addAll(values);
        // 方式2
        Collection<T> values1 = map.values();
        ArrayList<T> list1 = new ArrayList<>(values1);
        return list;
    }

    public  void delete(String id){
        map.remove(id);
    }
}
