package day21;

public class SubOrder4<E>  extends  Order<Integer>{
    E e;

    public SubOrder4(Integer integer, int oderId, E e) {
        super(integer, oderId);
        this.e = e;
    }

    public SubOrder4(E e) {
        this.e = e;
    }

    public SubOrder4(){

    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
