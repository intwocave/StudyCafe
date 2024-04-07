package ch09.sec07.exam01;

public class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("신기한 타이어가 굴라간다.");
        }
    };

    public void run() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            public void roll() {
                System.out.printf("더 신기한 타이어가 굴러간다");
            }
        };

    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
