package comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 19));
        students.add(new Student("Charlie", 21));
        students.add(new Student("Rich", 24));
        students.add(new Student("John", 28));

        // Sort by name
        Collections.sort(students, new NameCompare());
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }

        // Sort by age
        Collections.sort(students, new AgeCompare());
        System.out.println("\nSorted by age:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }

        // Sort by name using status method binarySearch 
        Collections.sort(students, new NameCompare());
        System.out.println("\nName found for Rich in index: " + Collections.binarySearch(students, new Student("Rich", 24), new NameCompare()));

         // Sort by age using status method binarySearch
        Collections.sort(students, new AgeCompare());
        System.out.println("\nAge found for Rich in index:" + Collections.binarySearch(students, new Student("Rich", 24), new AgeCompare()));
        

    }
}
