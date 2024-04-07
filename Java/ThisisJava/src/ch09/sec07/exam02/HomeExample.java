package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();
        home.use1();
        home.use2();
        home.use3(new ReCo() {
            public void turnOn() {
                System.out.println("냉장고 켜");
            }
            public void turnOff() {
                System.out.println("냉장고 꺼");
            }
        });
    }
}
