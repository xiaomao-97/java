package day12.java5;

public class CheckAccount extends  Account{
    private double overdraft;
    public CheckAccount(int id, double balance, double annualInterstRate,double overdraft){
        super(id,balance,annualInterstRate);
        this.overdraft = overdraft;

    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            //方式一
            // setBalance(getBalance()-amount)
            // 方式二
            super.withdraw(amount);
        } else if (overdraft >= amount - getBalance()) {  // 透支额度+余额足够消费
            overdraft -= (amount - getBalance());
//          setBalance(0);
//或者
            super.withdraw(getBalance());

        } else {
            System.out.println("超过可透支额度");
        }
    }
}
