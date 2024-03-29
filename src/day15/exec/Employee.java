package day15.exec;



public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public  abstract  double earnings();

    @Override
    public String toString() {
        return "MyDate{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }
}
