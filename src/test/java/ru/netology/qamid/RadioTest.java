package ru.netology.qamid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "9, 0",
            "1, 2",
            "-1, 1",
            "10, 1"
    })
    void nextStationTest(int a, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(a);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 9",
            "9, 8",
            "1, 0",
            "-1, 9",
            "10, 9"
    })
    void previousStationTest(int a, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(a);
        radio.previousStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "100, 100",
            "99, 100",
            "-1, 1",
            "101, 1"
    })
    void increaseVolumeTest(int a, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(a);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0",
            "100, 99",
            "99, 98",
            "-1, 0",
            "101, 0"
    })
    void decreaseVolumeTest(int a, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(a);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
