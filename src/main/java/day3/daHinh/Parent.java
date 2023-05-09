package day3.daHinh;

public class Parent {
    private String name;
    private String dob;

    public Parent(){

    }

    public Parent(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void play(){
        System.out.println("Play soccer");
    }
}
