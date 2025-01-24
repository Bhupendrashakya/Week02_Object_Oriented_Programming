//import java.util.ArrayList;
//
//class Employee{
//    private  String EmpName;
//    private String EmpId;
//
//    public Employee(String empName, String empId) {
//        EmpName = empName;
//        EmpId = empId;
//    }
//
//    public String getEmpName() {
//        return EmpName;
//    }
//
//    public String getEmpId() {
//        return EmpId;
//    }
//}
//class Department {
//    private String DepName;
//    private ArrayList<Employee> employees;
//
//    public Department(String depName) {
//        DepName = depName;
//        this.employees = new ArrayList<>();
//    }
//    public void addEmployee(Employee employee){
//        if (!employees.contains(employee)){
//            employees.add(employee);
//            System.out.println("Employee "+employee.getEmpName() +" is added to the "+DepName+" department ");
//        }
//    }
//    public void displayEmployee(){
//        System.out.println("In "+DepName+" there are following employees :");
//        for(Employee employee:employees){
//
//            System.out.println("Employee name : "+employee.getEmpName()+" and his id :"+employee.getEmpId());
//        }
//    }
//
//
//    public String getDepName() {
//        return DepName;
//    }
//}
//class Company{
//    private String CompName;
//    private ArrayList<Department> departments;
//
//    public Company(String compName) {
//        CompName = compName;
//        this.departments =new ArrayList<>();
//    }
//    public void addDepartment(Department department){
//        if (!departments.contains(department)){
//            departments.add(department);
//            System.out.println("Department "+department.getDepName()+" is added to the  Company "+CompName);
//        }
//    }
//    public void DisplayDepartments(){
//        System.out.println("The company "+CompName+" has the following departments :");
//        for (Department department:departments){
//            System.out.println(department.getDepName());
//            department.displayEmployee();
//
//        }
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Company " + CompName + " is being deleted, along with its departments and employees.");
//        super.finalize();
//    }
//}
//class Problem3
//{
//    public static void main(String[] args)
//    {
//        Company c1 = new Company("Autocrats Ltd.");
//
//        Department hr = new Department("HR");
//        Department engineering = new Department("Engineering");
//        ArrayList<Employee> employees = new ArrayList<Employee>();
//        for(int i=1;i<=10;i++)
//        {
//            employees.add(new Employee("Employee"+i,"0"+i));
//        }
//        for(int i=1;i<=10;i++)
//        {
//            if(i%2==1) hr.addEmployee(employees.get(i-1));
//            else engineering.addEmployee(employees.get(i-1));
//        }
//        c1.addDepartment(hr);
//        c1.addDepartment(engineering);
//        hr=null;
//        engineering= null;
//        c1.DisplayDepartments();
//        c1=null;
//        System.gc();
//        try
//        {
//            c1.DisplayDepartments();
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exception is catch :"+e);
//            System.out.println("This exception is catch because we have delete company object so all its entity got lost");
//        }
//    }
//
//
//}
