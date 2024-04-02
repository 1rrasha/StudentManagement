class Student {
    String name;
    int id;
    char status; // 'g' for Graduate, 'u' for Undergraduate
    int numberOfCourses;
    double[] grades;

    public Student(String name, int id, char status, int numberOfCourses) {
        this.name = name;
        this.id = id;
        this.status = status;
        this.numberOfCourses = numberOfCourses;
        this.grades = new double[numberOfCourses];
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade() {//calculate student average
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / numberOfCourses;
    }
}