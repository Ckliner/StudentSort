public class Student {
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    // We'll keep the toString method simple for a beginner level
    @Override
    public String toString() {
        return rollno + " - " + name + " - " + address;
    }
}
