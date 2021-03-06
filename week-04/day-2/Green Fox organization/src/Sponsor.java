public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " who represents "
            + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire(){
    this.hiredStudents++;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
