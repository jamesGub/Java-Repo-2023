package Classes;
public class Student {
    private static int id;
    private static String name;

    public Student(int s_id, String s_Name) { 
        id = s_id;
        name = s_Name;
    }

    public String toString() { 
        return "Student: " + name + "; ID: " + id;
    }

    public static void main(String[] args) { 
        Student s1 = new Student(1, "cat_girl"); 
        Student s2 = new Student(2, "James");

        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 

    }
}
