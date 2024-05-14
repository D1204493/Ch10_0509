public class Teacher extends Person {

  private String teacherId;


  public Teacher(String id, int age, String name, boolean gender, String department, String teacherId) {
    super(id, age, name, gender, department);
    this.teacherId = teacherId;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }


}
