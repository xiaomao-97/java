package day10.ExtendTest;

public class ExtendTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 1;
        person.eat();

        Student student = new Student();
        student.eat();
        student.sleep();
        student.breath();
    }
}
