package day15.exec;

public class SalariedEmployee extends  Employee{
    private int monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return  monthlySalary;

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString()+"monthlySalary=" + monthlySalary +
                '}';
    }
}
