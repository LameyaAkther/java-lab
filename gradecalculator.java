import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);

       System.out.print("Student ID: ");
       String studentID=scanner.nextLine();

       System.out.print("No. of Courses: ");
       int numCourses=scanner.nextInt();

       int totalCredits=0;
       int totalMarks=0;

       for(int i=1;i<=numCourses;i++)
       {
        System.out.println("\nCourse " + i + ":");
    
        System.out.print("Credit (Max 3): ");
        int credit = scanner.nextInt();

        System.out.print("CT (Max 30): ");
        int ctMarks = scanner.nextInt();

        System.out.print("AT (Max 10): ");
        int atMarks = scanner.nextInt();

        System.out.print("FE (Max 60): ");
        int feMarks = scanner.nextInt();
        int totalCourseMarks = ctMarks + atMarks + feMarks;
        totalMarks+=totalCourseMarks;
        totalCredits+=credit;

       }
       double cgpa = (double) totalMarks / totalCredits;
       String grade;
       if (cgpa >= 3.75) {
           grade = "A+";
       } else if (cgpa >= 3.5) {
           grade = "A";
       } else if (cgpa >= 3.0) {
           grade = "B+";
       } else if (cgpa >= 2.5) {
           grade = "B";
       } else if (cgpa >= 2.0) {
           grade = "C";
       } else {
           grade = "F";
       } 
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("CGPA: " + String.format("%.2f", cgpa));
        System.out.println("Grade: " + grade);
            


    }
}
