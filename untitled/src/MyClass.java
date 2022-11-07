public class MyClass {
    private String name;
    private String Surname;
    private int age;
    private String[]course;
    private  String food;

    public MyClass(String name,String Surname, int age){
        this.name=name;
        this.Surname=Surname;
        this.age=age;
    }
    public MyClass(String[]course,String food){
        this.course=course;
        this.food=food;

    }

    public void setName(String name) {
        this.name = name;
    }

   String getName() {
        return name;
    }

   void setSurname(String surname) {
        Surname = surname;
    }

     String getSurname() {
        return Surname;
    }

     void setAge(int age) {
        this.age = age;
    }

     int getAge() {
        return age;
    }

      void setCourse(String[] course) {
        this.course = course;
    }

      String[] getCourse() {
        return course;
    }

     void setFood(String food) {
        this.food = food;
    }

     String getFood() {
        return food;
    }
}
