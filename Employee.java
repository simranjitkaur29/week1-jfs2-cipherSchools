package Constructor;


public class Employee {
    int employeeId;
    int salary;
    String dept;

    Employee(int employeeId,int salary,String dept)
    {
        this.employeeId=employeeId;
        this.salary=salary;
       this.dept=dept;
    }
    
    public static void main(String[] args) {
        Employee Ramesh=new Employee(111, 10000, "IT");
        System.out.println("Employee id "+Ramesh.employeeId+" Salary: "+Ramesh.salary+" Department: "+Ramesh.dept);
    }
}
