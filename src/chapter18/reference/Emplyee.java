package chapter18.reference;

public class Emplyee {
    private int id;
    private String name;


    public Emplyee(){

    }

    public  Emplyee(int id){
        this.id = id;
    }

    public Emplyee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
