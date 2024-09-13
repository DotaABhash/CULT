public class Student {
    static int id;
    static String name;
    static String grade;

    public static void main(String[] args) {
        Student student = new Student();
        student.id=1;
        student.name="Abhash Khadka";
        student.grade="A+";

        System.out.println("Student id="+ id);
        System.out.println("Student name="+name);
        System.out.println("Grade aquired="+grade);
    }
}
