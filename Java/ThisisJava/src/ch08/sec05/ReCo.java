package ch08.sec05;

public interface ReCo {
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    void turnOn();
    void turnOff();
    void setVol(int vol);

    default void setMute(boolean mute) {
        if(mute) setVol(MIN_VOL);
        else setVol(MAX_VOL);
    }
}
