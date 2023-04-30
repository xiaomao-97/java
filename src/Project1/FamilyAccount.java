package Project1;

public class FamilyAccount {
    public static  void main(String[] args){
        boolean isFlag = true;
        int balance = 10000;
        String details = "";
        System.out.println("1+2"+3+"\n"+"5");

        while(isFlag){
            System.out.println("__________________________家庭收支记账软件________________________\n");
            System.out.println("                            1 收支明细");
            System.out.println("                            2 登记收入");
            System.out.println("                            3 登记输出");
            System.out.println("                            4 退   出\n");
            System.out.print("                              请选择（1-4）：");

            char selection = Utility.readMenuSelection();
            switch (selection){

                case '1':
                    System.out.println("1 收支明细");
                    System.out.println("收支\t账户金额\t收支金额\t说明 \n");
                    System.out.println(details);
                    System.out.println(("____________________________"));
                    break;
                case '2':
                    System.out.println("2 登记收入");
                    System.out.print("本次收入金额");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明");
                    String info = Utility.readString();
                    balance += money;
                    details += ("收入\t"+balance+"\t"+money+"\t"+info+"\n");
                    System.out.println("_________________登记完成_______________________\n");
                    break;
                case '3':
                    System.out.print("本次支出金额");
                    int money1= Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String info1 = Utility.readString();
                    if (balance >=money1){
                        balance -=money1;
                    }else {
                        System.out.println("支出超出金额，支付失败");
                    }

                    System.out.println("3.登记支出");
                    break;
                case '4':
                    System.out.print("确认是否推出Y/N：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit =='Y'){
                        isFlag = false;
                    }


            }

        }
    }
}
