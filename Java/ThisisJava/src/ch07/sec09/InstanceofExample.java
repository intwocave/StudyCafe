package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        if(person instanceof Student) {
            Student stu = (Student) person;
            System.out.println(stu.stuNo);
            stu.study();
        }

        if(person instanceof Student stu) {
            System.out.println(stu.stuNo);
            stu.study();
        }
    }

    public static void main(String[] args) {
        personInfo(new Person("홍길동"));
        personInfo(new Student("생도", 3827));
    }
}

