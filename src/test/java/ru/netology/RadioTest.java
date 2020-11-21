package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(value = {"0, 1", "9, 0"})
    void nextRadioStationNumber(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(currentRadioStation);
        radio.nextRadioStationNumber();

        assertEquals(expected, radio.getRadioStationNumber());
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 9", "9, 8"})
    void prevRadioStationNumber(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(currentRadioStation);
        radio.prevRadioStationNumber();

        assertEquals(expected, radio.getRadioStationNumber());
    }

    @ParameterizedTest
    @CsvSource(value = {"10, 10", "0, 1"})
    void increaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {"10, 9", "0, 0"})
    void decreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }
}