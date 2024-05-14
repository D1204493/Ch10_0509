public class Person {

  private String id;
  private int age;
  private String name = "";
  private boolean gender;
  private String department;

  public Person(String id, int age, String name, boolean gender, String department) {
    this.id = id;
    this.age = age;
    this.name = name;
    this.gender = gender;
    this.department = department;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isGender() {
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }



}
