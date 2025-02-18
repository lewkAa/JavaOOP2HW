package ru.netology.qamid;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class Radio {


    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int stationCount) {
        maxStation = (stationCount < 1) ? minStation : --stationCount;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation || newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= minVolume && newCurrentVolume <= maxVolume) {
            currentVolume = newCurrentVolume;
        }
    }

    public void nextStation() {
        currentStation = (currentStation == maxStation) ? minStation : ++currentStation;
    }

    public void previousStation() {
        currentStation = (currentStation == minStation) ? maxStation : --currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume)
            currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume)
            currentVolume--;
    }

}
