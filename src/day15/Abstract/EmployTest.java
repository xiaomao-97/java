package day15.Abstract;

public class EmployTest {
    public static void main(String[] args) {
        Manager manager = new Manager("库克",1001,5000,1500);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }

}
