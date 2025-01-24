//import java.util.ArrayList;
//
//class Student{
//    private String stuName;
//    private String rollNumber;
//    private ArrayList<Course>courses;
//    public Student(String stuName, String rollNumber) {
//        this.stuName = stuName;
//        this.rollNumber = rollNumber;
//        this.courses=new ArrayList<>();
//    }
//
//    public String getStuName() {
//        return stuName;
//    }
//
//    public String getRollNumber() {
//        return rollNumber;
//    }
//    public void AddCourseInStudent(Course course){
//        if (!courses.contains(course)){
//            courses.add(course);
//            System.out.println(course.getCourseName()+" course is added to the student  "+stuName);
//        }
//    }
//    public void displayStudentCourses(){
//        System.out.println(stuName+" has enrolled in following courses:");
//        for(Course course: courses){
//            System.out.println(course.getCourseName());
//        }
//    }
//}
//
//class Course{
//    private String courseName;
//    ArrayList<Student> students;
//
//    public Course(String courseName) {
//        this.courseName = courseName;
//        this.students = new ArrayList<>();
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//    public void addStudent(Student student){
//        if (!students.contains(student)){
//            students.add(student);
//            System.out.println(student.getStuName()+" student is added to the course "+courseName);
//            student.AddCourseInStudent(this);
//        }
//    }
//    public void showStudents(){
//        int count=1;
//        for (Student student: students){
//            System.out.println(count+" "+ student.getStuName()+" "+student.getRollNumber());
//            count++;
//        }
//    }
//}
//class School{
//
//
//    private String schoolName;
//    ArrayList<Course> courses;
//
//    public School(String schoolName) {
//        this.schoolName = schoolName;
//        this.courses = new ArrayList<>();
//    }
//
//    public String getSchoolName() {
//        return schoolName;
//    }
//    public void AddCourse(Course course){
//        if (!courses.contains(course)){
//            courses.add(course);
//            System.out.println(course.getCourseName()+" is added to the school "+schoolName);
//        }
//
//    }
//    public void showCourseDetails(){
//        System.out.println(schoolName+" has the following courses :");
//        for(Course course: courses){
//            System.out.println(course.getCourseName()+" has following students :");
//            course.showStudents();
//        }
//    }
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("School " + schoolName + " is being deleted, along with its departments and employees.");
//        super.finalize();
//    }
//
//}
//public class Problem4 {
//    public static void main(String[] args) {
//        School GJ=new School("Gyaan Jyoti high school");
//        Course computer=new Course("Computer");
//        Course sports=new Course("Sports");
//        Course cinema=new Course("Cinema");
//        Course photography=new Course("Photography");
//        GJ.AddCourse(computer);
//        GJ.AddCourse(sports);
//        GJ.AddCourse(cinema);
//        GJ.AddCourse(photography);
//
//        Student s1=new Student("Aryan","GJ101");
//        Student s2=new Student("karan","GJ102");
//        Student s3=new Student("Nikhil","GJ103");
//        Student s4=new Student("gourav ","GJ104");
//        Student s5=new Student("Aman","GJ105");
//        Student s6=new Student("kartik","GJ106");
//        Student s7=new Student("Abhisek","GJ107");
//        Student s8=new Student("kunal","GJ108");
//        Student s9=new Student("gayatri","GJ109");
//        Student s10=new Student("gagan","GJ110");
//        Student s11=new Student("ravendra","GJ111");
//        computer.addStudent(s1);
//        computer.addStudent(s2);
//        computer.addStudent(s3);
//        sports.addStudent(s4);
//        sports.addStudent(s1);
//        sports.addStudent(s5);
//        sports.addStudent(s6);
//        cinema.addStudent(s7);
//        cinema.addStudent(s8);
//        cinema.addStudent(s9);
//        photography.addStudent(s10);
//        photography.addStudent(s11);
//        GJ.showCourseDetails();
//    GJ=null;
//    System.gc();
//        try
//        {
//            GJ.showCourseDetails();
//        }
//        catch (Exception e)
//        {
//            System.out.println("Exception is catch :"+e);
//            System.out.println("This exception is catch because we have delete school object so all its entity got lost");
//        }
//        //showing Aggregation
//        computer.showStudents();
//        s1.displayStudentCourses();
//    }
//}
