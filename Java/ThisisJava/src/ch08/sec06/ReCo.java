package ch08.sec06;

public interface ReCo {
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    void turnOn();
    void turnOff();
    void setVol(int vol);

    default void setMute(boolean mute) {
        if (mute) setVol(MAX_VOL);
        else setVol(MIN_VOL);
    }

    static void changeBatt() {
        System.out.println("Changing Battery..");
    }
}
