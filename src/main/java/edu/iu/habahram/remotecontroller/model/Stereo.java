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
        return "Stereo is set for CD input at " + location;
    }

    public String setDvd() {
        return "Stereo is set for DVD input at " + location;
    }

    public String setRadio() {
        return "Stereo is set for Radio input at " + location;
    }

    public String setVolume(int volume) {
        this.volume = volume;
        return "Stereo volume set to " + volume + " at " + location;
    }


}
