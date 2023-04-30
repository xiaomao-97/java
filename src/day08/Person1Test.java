package day08;

public class Person1Test {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "Tom";
        person1.age = 18;
        person1.sex =1;
        person1.study();
        person1.showAge();
        int newAge = person1.addAge(2);
        System.out.println(person1.name+"的新年龄为："+newAge);

        System.out.println(person1.age);

        //***************************//
        Person1 person2 = new Person1();
        person2.showAge();
    }
}
