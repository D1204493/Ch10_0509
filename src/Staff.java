public class Staff extends Person {
  private String staffId;
  private String task;

  public Staff(String id, int age, String name, boolean gender, String department, String staffId, String task) {
    super(id, age, name, gender, department);
    this.staffId = staffId;
    this.task = task;
  }
}
