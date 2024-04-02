import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of students in the department");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        StudentChart chart = new StudentChart(numberOfStudents);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter Student name:");
            String name = scanner.nextLine();

            System.out.println("Enter Student ID:");
            int id = scanner.nextInt();
            scanner.nextLine();

            char status;
            do {
                System.out.println("Enter Student status, enter 'g' for Graduate or 'u' for Undergraduate:");
                status = scanner.nextLine().charAt(0);
            } while (status != 'g' && status != 'u');//to make sure the user don't invoke another char that isn't g or u, it will keep asking him to enter the student status until the user enter it right

            System.out.println("How many courses did the student register?");
            int numberOfCourses = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(name, id, status, numberOfCourses);

            //get the grade for each course
            for (int j = 0; j < numberOfCourses; j++) {
                System.out.println("Enter grade for course " + (j + 1) + " for student " + name + ":");
                double grade = scanner.nextDouble();
                student.grades[j] = grade;
            }

            chart.addStudent(student, i);

            // Display the average for the current student
            double averageGrade = student.calculateAverageGrade();
            System.out.println("Average grade for student " + name + " is: " + averageGrade);
            System.out.println();
            scanner.nextLine();
        }

        chart.displayStudentInfo();
    }
}
