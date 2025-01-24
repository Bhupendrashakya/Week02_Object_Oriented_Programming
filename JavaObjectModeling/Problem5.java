
// create a class Faculty with a field name of type String
class Faculty{
    private String name;
    public String getName(){
        return this.name;
    }
    public Faculty(String name){
        this.name = name;
        System.out.println("Faculty created: " + this.name);
    }
}
// create a class Department with a field name of type String and a field faculties of type Faculty[]
class Department{
    private String name;
    public String getName(){
        return this.name;
    }
    public Department(String name, Faculty[] faculties){
        this.name = name;
        System.out.println("Department created: " + this.name);
        for (Faculty f : faculties) {
            System.out.println("Faculty in department: " + f.getName());
        }
    }
}
// create a class University with a field departments of type Department[]
 class University{
    private Department[] departments;
    public University(Department[] departments){
        this.departments = departments;
        System.out.println("University created");
        for (Department d : departments) {
            System.out.println("Department in university: " + d.getName());
        }
    }
    public void getDepartments(){
        for (Department d : departments) {
            System.out.println("Department in university: " + d.getName());
        }
    }
}
class Problem5{
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Sanjeev");
        Faculty f2 = new Faculty("Amit");
        Department d1 = new Department("Software engineering", new Faculty[]{f1, f2});
        Department d2 = new Department("MACHINE LEARNING", new Faculty[]{f2});
        @SuppressWarnings("unused")
        University u = new University(new Department[]{d1, d2});
    }
}