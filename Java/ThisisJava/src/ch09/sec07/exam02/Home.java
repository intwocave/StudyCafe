package ch09.sec07.exam02;

public class Home {
    private ReCo rc = new ReCo() {
        @Override
        public void turnOn() {
            System.out.println("켜");
        }

        @Override
        public void turnOff() {
            System.out.println("꺼");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        ReCo rc = new ReCo() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 켜");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 꺼");
            }
        };

        rc.turnOn();
        rc.turnOff();
    }

    public void use3(ReCo rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
