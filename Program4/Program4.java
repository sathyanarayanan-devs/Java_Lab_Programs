package Program4;
class Person{
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

//Single Inheritance
class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    //Method Overriding
    @Override
    void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
    }

    //Method Overloading
    void showDetails(){
        System.out.println("Student details displayed successfully.");
    }

    void showDetails(String dept){
        System.out.println("Department: " + dept);
    }
}

//Multilevel Inheritance
class SportsStudent extends Student {
    String sport;

    SportsStudent(String name, int rollNo, String sport) {
        super(name, rollNo);
        this.sport = sport;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Sport: " + sport);
    }
}

//Hierarchical Inheritance
class Teacher extends Person {
    String subject;
    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

public class Program4 {
    public static void main(String[] args) {
        System.out.println("===== Student ======");
        Student student = new Student("John Doe", 101);
        student.display();
        student.showDetails();
        student.showDetails("Computer Science");

        System.out.println("\n===== Sports Student ======");
        SportsStudent sportsStudent = new SportsStudent("Jane Smith", 102, "Basketball");
        sportsStudent.display();

        System.out.println("\n===== Teacher ======");
        Teacher teacher = new Teacher("Mr. Johnson", "Mathematics");
        teacher.display();
    }    
}
