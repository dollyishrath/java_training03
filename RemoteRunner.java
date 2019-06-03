package com.trimindtech.training.day03;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote1= new Remote();
        remote1.start();
        remote1.increaseChannel();
        Remote remote2= new Remote();
        remote2.increaseChannel();

    }
}
