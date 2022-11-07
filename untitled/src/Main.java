import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MyClass myClass = new MyClass("Bektur", "Duyshenbek uulu", 21);
        MyClass myClass1 = new MyClass(new String[]{"Java", "English", "Soft Skills"}, "Плов");

        System.out.println("Name: "+myClass.getName());
        System.out.println("Surname: "+myClass.getSurname());
        System.out.println("Age: "+myClass.getAge());
        System.out.println("Courses: "+Arrays.toString(myClass1.getCourse()));
        System.out.println("Food :"+myClass1.getFood());
    }
}