package day21.exer1;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();
        dao.save("1001", new User(1, 23, "zhoujielun"));
        dao.save("1002", new User(2, 22, "kunlling"));
        List<User> list = dao.list();
        for(User user:list){
            System.out.println(user);
        }
        System.out.println();
        dao.update("1002",new User(3,4,"cyl"));
        List<User> list1 = dao.list();
        for(User user:list1){
            System.out.println(user);
        }
        System.out.println();
        dao.delete("1002");
        List<User> list2 = dao.list();
        for(User user:list2){
            System.out.println(user);
        }

    }
}
