package day1.bt3;

public class Student {
    private long id;
    private String name;
    private long mark;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name, long mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMark() {
        return mark;
    }

    public void setMark(long mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
