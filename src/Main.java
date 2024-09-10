import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        while (true) {
            System.out.println("请输入指令(add，delete，print或exit)：");
            String command = in.next();

            if (command.equals("add")){
                System.out.println("请输入要添加的雇员数量：");
                int num = in.nextInt();
                System.out.println("请按顺序输入要添加的雇员名称与年龄：");
                for (int i = 0; i < num; i ++){
                    String name = in.next();
                    int age = in.nextInt();
                    employeeService.addEmployee(name, age);
                }
                System.out.println("添加成功！");
            }else if (command.equals("delete")){
                System.out.println("请输入要删除的雇员名称：");
                String delName = in.next();
                employeeService.deleteEmployee(delName);
                System.out.println("删除成功！");
            }else if (command.equals("print")){
                System.out.println("正在打印：");
                employeeService.printAllEmployees();
            }else if (command.equals("exit")){
                System.out.println("退出成功！");
                in.close();
                break;
            }
        }
    }
}