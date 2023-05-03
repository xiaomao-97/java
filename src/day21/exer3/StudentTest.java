package day21.exer3;

public class StudentTest {
    public static void main(String[] args) {
        /*

         */
        Student<String> s1 = new Student<>("Tim", "良好");
        Student<Double> s2 = new Student<>("Jerry", 87.5); //87.5 自动装箱
        Student<Character> s3 = new Student<>("rose", 'S');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
