package day2;

public class Student {
    private String id;
    private String name;
    private double mark; // [0, 10]

    // Contructor
    public Student(String id){
        this.id = id;
    }
    public Student(String id, String name, double mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    // Alt + insert (Command + N)

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
