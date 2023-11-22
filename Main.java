import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 students to the ArrayList
        students.add(new Student(1, "Chris", "Street 15165"));
        students.add(new Student(2, "Ethan", "Street 25611"));
        students.add(new Student(2, "Liam", "Street 65613"));
        students.add(new Student(2, "Alice", "Street 46511"));
        students.add(new Student(2, "Olivia", "Street 51651"));
        students.add(new Student(2, "Aiden", "Street 61616"));
        students.add(new Student(2, "Lucas", "Street 7565"));
        students.add(new Student(2, "Mason", "Street 81655"));
        students.add(new Student(2, "Sophia", "Street 96511"));
        students.add(new Student(2, "Ava", "Street 106511"));


        // Sort by name
        SelectionSort.sort(students, new SortByName());
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number
        SelectionSort.sort(students, new SortByRollNo());
        System.out.println("\nSorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
