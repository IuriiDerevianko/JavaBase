package ua.itea.javabasic.practice.lesson14.racingcars;

class Audio {
    private boolean on;
    private String track;
    private byte volume;

    public void play() {
        //...insert real code here...
        //...insert real code here...
        if (on) {
            // debug info
            System.out.println("Playing: " + track + " ...");
        }
    }

    public void turn(boolean mode) {
        this.on = mode;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void setVolume(byte volume) {
        if(volume < 0) {
            throw new IllegalArgumentException("Negative volume (audio) value;");
        }
        this.volume = volume;
    }

    public void updateDisplay() {
        if (!on) {
            System.err.println("Cannot update display, Audio is off.");
            return;
        }
        //...insert real code here...
        System.out.println("Track: " + track);
        System.out.println("Volume: " + volume);
    }
}