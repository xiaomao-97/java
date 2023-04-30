package day08;

public class Student2Test {
    public static void main(String[] args) {
        Student1[] students = new Student1[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student1();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            students[i].score = (int) (Math.random() * (100 - 0) + 1);
        }

        Student2Test student2Test = new Student2Test();
        student2Test.print(students);
        // 遍历学生数组
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].number + "," + students[i].state + "," + students[i].score);
        }
    }

    public void print(Student1[] students){
        for(int i=0; i<students.length;i++){
            System.out.println(students[i].info());
        }
    }

    public void searchState(Student1[] students ,int state){
        for(int i=0; i<students.length;i++){
            if (students[i].state==state){
                System.out.println(students[i].info());
            }
        }
    }

    public void sort(Student1[] students){
        for (int i =0; i<students.length-1;i++){
            for (int j=0;j<students.length-1;j++){
                if (students[j].score > students[j+1].score){
                    // 如果需要环旭，交换的是数组元素，Student对象，否则就交换同学的成绩
                    Student1 temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;

                }
            }
        }
    }
}

class Student1{
    int number;
    int state;
    int score;

    public String info(){
        return "学号："+number+"年纪"+state+"分数"+score;
    }

}
