
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private final ArrayList<Student>students = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(id,name,age,course));
        System.out.println("Student added successfully!");
    }

   public void viewStudent(){
    if( !students.isEmpty()){
        System.out.println(" Id | Name | Age | Course");
        for (Student s: students){
                System.out.println(s);
        }
    } else {
        System.out.println(" No Students records found");
    }
    }

    public void updateStudent(){
        System.out.println("Student Id to update:");
        int id = sc.nextInt();
        sc.nextLine();

        for(Student s: students){
            if(s.getId()==id){
                System.out.println("Enter New Name:");
                s.setName(sc.nextLine());
                System.out.println("Enter New Age:");
                s.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter New Course:");
                s.setCourse(sc.nextLine());
                System.out.println("student updated successfully!");
                return;
            }
        }
        System.out.println("Student Id not found!");
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.addStudent();
    }
}
