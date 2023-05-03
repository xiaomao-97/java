package day21;

import java.util.ArrayList;

public class Order <T>{
    T t;
    int oderId;

    public Order(T t, int oderId) {
        this.t = t;
        this.oderId = oderId;
    }

    public Order() {

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOderId() {
        return oderId;
    }

    public void setOderId(int oderId) {
        this.oderId = oderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "t=" + t +
                ", oderId=" + oderId +
                '}';
    }

    public <E>ArrayList<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e:arr){
            list.add(e);
        }
        return list;
    }

}
