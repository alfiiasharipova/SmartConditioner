package ru.netology;

public class Radio {
    private int radioStationNumber;
    private int currentVolume;
    private final int maxRadioStation;
    private final int minRadioStation = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio() {
        this.maxRadioStation = 10;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }


    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber > maxRadioStation) return;
        if (radioStationNumber < minRadioStation) return;
        this.radioStationNumber = radioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) return;
        if (currentVolume < minVolume) return;
        this.currentVolume = currentVolume;
    }

    public void nextRadioStationNumber() {
        this.radioStationNumber = (this.radioStationNumber == maxRadioStation) ? 0 : this.radioStationNumber + 1;
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
