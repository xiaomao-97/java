package day08;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i=0;i<students.length;i++){
            students[i] = new Student();
            students[i].number = i+1;
            students[i].state =(int) (Math.random() * (6-1+1)+1);
            students[i].score = (int)(Math.random()*(100-0)+1);
        }
        // 遍历学生数组
        for(int i=0; i<students.length;i++){
            System.out.println(students[i].number+","+students[i].state+","+students[i].score);
        }

        for(int i=0; i<students.length;i++){
            System.out.println(students[i].info());
        }
        System.out.print("******************");
        for(int i=0; i<students.length;i++){
            if (students[i].state==3){
                System.out.println(students[i].info());

            }
        }

        for (int i =0; i<students.length-1;i++){
            for (int j=0;j<students.length-1;j++){
                if (students[j].score > students[j+1].score){
                    // 如果需要环旭，交换的是数组元素，Student对象，否则就交换同学的成绩
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;

                }
            }
        }



    }
}

class Student{
    int number;
    int state;
    int score;

    public String info(){
        return "学号："+number+"年纪"+state+"分数"+score;
    }

}
