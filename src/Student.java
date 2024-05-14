public class Student extends Person {

  private String studentId;
  private String year;

  public Student(String id, int age, String name, boolean gender, String department, String studentId, String year) {
    super(id, age, name, gender, department);
    this.studentId = studentId;
    this.year = year;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


}
