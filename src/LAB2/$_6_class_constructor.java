public class $_6_class_constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("jonayed",123);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}
class Student{
    String name;
    int roll;
    Student(String n,int r){
        name=n;
        roll=r;
    }

    public Student() {

    }
}
