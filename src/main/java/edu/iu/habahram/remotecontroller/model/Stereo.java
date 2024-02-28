package edu.iu.habahram.remotecontroller.model;

public class Stereo {
    private int volume;
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        return "Stereo is on " + setCd() +" " + setVolume(8) + " at" + location;
    }

    public String off() {
        return "Stereo is off at " + location;
    }

    public String setCd() {
        return "set for CD input";
    }

    public String setDvd() {
        return "set for DVD input";
    }

    public String setRadio() {
        return "set for Radio input";
    }

    public String setVolume(int volume) {
        this.volume = volume;
        return "volume set to " + volume;
    }


}
