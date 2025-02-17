package ru.netology.qamid;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void nextStation() {
        currentStation = (currentStation == 9) ? 0 : currentStation + 1;
    }

    public void previousStation() {
        currentStation = (currentStation == 0) ? 9 : currentStation - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9 || newCurrentStation < 0) {
            return;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100)
            currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume > 0)
            currentVolume--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100 || newCurrentVolume < 0) {
            return;
        } else currentVolume = newCurrentVolume;
    }
}
