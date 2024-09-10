import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    private Map<String, Employee> employeeMap;

    public EmployeeService(){
        this.employeeMap = new HashMap<>();
    }

    public void addEmployee(String name, int age){
        Employee employee = new Employee(name, age);
        this.employeeMap.put(name, employee);
    }

    public void deleteEmployee(String name){
        this.employeeMap.remove(name);
    }

    public void printAllEmployees(){
        System.out.println("共计" + employeeMap.size() + "人：");
        for (Map.Entry<String, Employee> entry: employeeMap.entrySet()){
            System.out.println("姓名: " + entry.getKey() + " 年龄: " + entry.getValue().getAge());
        }
    }
}
