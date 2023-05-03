package day21.apply;

import java.util.List;

public class DAO<T> {
    public void insert(T bean) {
        // 通过相应的sql语句，讲beam对象的属性写入到数据表中
    }

    public  T deleteById(int id){
        return null;
    }

    public void  update(int id,T bean){}

    public T queryForInstance(int id){
        return null;
    }

    public List<T> queryForList(int id){
        return null;
    }

    // 定义一个泛型方法
    //比如：查询数据库表中的记录数  (E :LONG)
    //比如：查询表中最大的生日  (E :Date类型)
    public <E> E getValue(String sql){
        return  null;
    }

}
