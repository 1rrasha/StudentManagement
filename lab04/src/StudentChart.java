class StudentChart {
    Student[] students;//array of type object for student class

    public StudentChart(int numberOfStudents) {//constructor
        students = new Student[numberOfStudents];
    }

    public void addStudent(Student student, int index) {
        students[index] = student;
    }

    public void displayStudentInfo() {
        for (Student student : students) {
            if (student != null) {
                double averageGrade = student.calculateAverageGrade();
                System.out.println(student.name + " with id: " + student.id + " has average= " + averageGrade);
            }
        }
    }
}
