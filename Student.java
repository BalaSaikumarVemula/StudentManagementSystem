public class Student extends Person {
    private String studentId;
    private String course;

    public Student(String studentId, String name, int age, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String getDetails() {
        return studentId + "," + getName() + "," + getAge() + "," + course;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + " | Name: " + getName() + " | Age: " + getAge() + " | Course: " + course;
    }
}
