package Program3;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];
    int total;
    double average;
    char grade;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    //methods to get marks
    void getMarks(Scanner sc){
        total = 0;
        System.out.println("\nEnter marks for 5 subjects: ");
        for(int i=0; i<5; i++){
            System.out.println("Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = (double)total / marks.length;
    }

    //calculate grade
    void calculateGrade(){
        if(average >= 90){
            grade = 'A';
        } else if(average >= 80){
            grade = 'B';
        } else if(average >= 70){
            grade = 'C';
        } else if(average >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    //display student details
    void displayDetails(){
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for(int i=0; i<marks.length; i++){
            System.out.println("Subject " + (i+1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        Student student = new Student(rollNo, name);
        student.getMarks(sc);
        student.calculateGrade();
        student.displayDetails();
        sc.close();
    }
}