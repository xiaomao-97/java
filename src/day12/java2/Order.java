package day12.java2;

public class Order {
    private  int orderPrivate;
    int orderDefault;
    protected  int orderProtected;
    public int orderPublic;

    private void  methodPrivate(){
        orderPrivate = 1;

    }

    void methodDefault(){

    }

    public int getOrderPrivate() {
        return orderPrivate;
    }

    public void setOrderPrivate(int orderPrivate) {
        this.orderPrivate = orderPrivate;
    }

    protected void methodProtected(){

    }

    public void  methodPublic(){

    }



}
