package day18;

public class Product  implements  Comparable{
    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    /*
    正数，当前对象大
    负数，当前对象小
    比较的标准，价格相同，进行名字的比较，从小到大
     */
    @Override
    public int compareTo(Object o) {
        if (o==this){
            return 0;
        }
        if(o instanceof Product){
            Product p = (Product) o;
            int value =  Double.compare(this.price, p.price);
            if(value !=0){
                return  value;
            }
            return this.name.compareTo(p.name);
        }
        throw new RuntimeException("类型不匹配");

    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
