package day12;

public class Kids extends  MainKind{
    private int yearsOld;

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am"+yearsOld+"years old");
    }

}
