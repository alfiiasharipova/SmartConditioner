package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int radioStationNumber;
    private int currentVolume;
    private int maxRadioStation = 10;
    private final int minRadioStation = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;


    public void nextRadioStationNumber() {
        this.radioStationNumber = (this.radioStationNumber == maxRadioStation) ? minRadioStation : this.radioStationNumber + 1;
    }

    public void prevRadioStationNumber() {
        this.radioStationNumber = (this.radioStationNumber == minRadioStation) ? maxRadioStation : this.radioStationNumber - 1;
    }

    public void increaseVolume() {
        if (this.currentVolume == maxVolume) return;
        this.currentVolume += 1;
    }

    public void decreaseVolume() {
        if (this.currentVolume == minVolume) return;
        this.currentVolume -= 1;
    }

}
