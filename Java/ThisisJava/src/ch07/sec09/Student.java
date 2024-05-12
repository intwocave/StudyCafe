package ch07.sec09;

public class Student extends Person {
    public int stuNo;

    public Student(String name, int stuNo) {
        super(name);
        this.stuNo = stuNo;
    }

    public void study() {
        System.out.println("勉強します");
    }
}
