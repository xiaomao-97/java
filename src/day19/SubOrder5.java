package day19;

import day21.Order;

public class SubOrder5<T,E> extends Order<T> {

    E e;

    public SubOrder5(T t, int oderId, E e) {
        super(t, oderId);
        this.e = e;
    }

    public SubOrder5(E e) {
        this.e = e;
    }
    public SubOrder5(){

    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
