package day11.src.view;

import day11.src.CMUtility;
import day11.src.bean.Customer;
import day11.src.service.CustomerList;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView(){
        Customer customer = new Customer("王涛",'男',23,"11111111","11111@123.com");
        customerList.addCustomer(customer);
    }

    public void enterMainMenu() {
        boolean isFlag =true;
        while(isFlag){
            System.out.println("\n ----------------客戶管理信息軟件------------");
            System.out.println("                     1 添加用户");
            System.out.println("                     2 修改用户");
            System.out.println("                     3 删除用户");
            System.out.println("                     4 客户列表");
            System.out.println("                     5 退 出\n");
            System.out.println("                   请选择（1-5）");
            // 用户只可以输入1,2,3,4中的一个
            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出Y/N");

            }

        }




    }

    private void addNewCustomer() {
        System.out.println("-----------------------------添加客户-----------------");
        System.out.print("姓名：");
        String name= CMUtility.readString(10);
        System.out.print("性别：");
        char gender =CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);
        // 将数据封装到对象中
        Customer  customer = new Customer(name,gender,age ,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("--------------------添加完成-------------");
        }else {
            System.out.println("------------------客户目录已满，添加失败------------");
        }
    }

    public void modifyCustomer() {
        System.out.println("--------------------添加完成-------------");
        Customer customer;
        int number;
        for(;;){
            System.out.print("请选择待修改客户编号的（-1退出）");
            number = CMUtility.readInt();
            if(number ==-1){
                return;
            }
            customer = customerList.getCustomer(number-1);
            if (customer==null){
                System.out.println("无法找到指定用户");
            }else{
                break;
            }
        }
        System.out.print("姓名（"+customer.getName()+"):");
        String name = CMUtility.readString(10,customer.getName());
        System.out.print("性别（"+customer.getGender()+"):");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄（"+customer.getGender()+"):");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("电话（"+customer.getPhone()+"):");
        String phone = CMUtility.readString(13,customer.getPhone());
        System.out.print("邮箱（"+customer.getEmail()+"):");
        String email = CMUtility.readString(20,customer.getEmail());

        Customer customer1 = new Customer(name,gender,age,phone,email);
        boolean isReplaced = customerList.replaceCustomer(number,customer1);
        if (isReplaced){
            System.out.println("---------------修改完成-------------------");
        }
    }

    public void deleteCustomer() {
        System.out.println("-------------------删除客户------------");
        int number;
        for(;;){
            System.out.print("请选择待删除客户编号的（-1退出）");
            number = CMUtility.readInt();
            if (number==-1){
                return;
            }
            Customer customer  = customerList.getCustomer(number-1);
            if(customer==null){
                System.out.println("无法找到指定客户");
            }else{
                break;
            }
        }
        System.out.print("确认是否删除(Y/N):");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete =='Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if (deleteSuccess) {
                System.out.println("-----------------------删除完成--------------------");
            }
        }else{
            return;
        }
    }

    public void listAllCustomers() {
        System.out.println("-----------------------------客户列表-----------------\n");
        int total = customerList.getTotal();
        if(total ==0){
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer[] customers = customerList.getAllCustomers();
            for(int i=0;i< total;i++){
                Customer customer = customers[i];
                System.out.println((i+1)+"\t"+customer.getName()+
                        "\t"+customer.getGender()+"\t"+customer.getAge()+
                        "\t"+customer.getPhone()+"\t"+customer.getEmail());
            }
        }
        System.out.println("-----------------------------客户列表完成-----------------\n");
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
