import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // compare students based on rollNo and then name
        if (s1.getRollNo() != s2.getRollNo()) {
            return s1.getRollNo() - s2.getRollNo();
        } else {
            return s1.getName().compareTo(s2.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "John"));
        students.add(new Student(102, "Jane"));
        students.add(new Student(103, "Bob"));
        students.add(new Student(104, "Alice"));

        // sort students using the custom comparator
        Collections.sort(students, new StudentComparator());

        // print the sorted list
        for (Student student : students) {
            System.out.println(student.getRollNo() + " " + student.getName());
        }
    }
}
