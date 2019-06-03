package com.trimindtech.training.day03;

public class Remote {

    private int currentChannel;
    private int currentVolume;
    private boolean state;

    public void start(){
        this.state = true;
        System.out.println("tv is on");
    }
    public void increaseChannel(){
        if(!this.state){
            System.out.println("tv is off, please on the tv");
            return;
        }
        this.currentChannel++;
        System.out.println("current channel is"+this.currentChannel);
    }
    public void decreaseChannel(){
        this.currentChannel--;
        System.out.println("current channel is"+this.currentChannel);
    }
    public void increaseVolume(){
        this.currentVolume++;
        System.out.println("current volume is"+this.currentVolume);
    }
    public void decreaseVolume(){
        this.currentVolume--;
        System.out.println("current volume is"+this.currentVolume);
    }
    public void state() {
        this.state = false;
        System.out.println("stop tv");
    }

    public int getChannel() {
        return currentChannel;
    }

    public void setChannel(int channel) {
        this.currentChannel = channel;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int volume) {
        this.currentVolume = volume;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
