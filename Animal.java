package com.trimindtech.training.day03;

public class Animal {
    public Animal(String color1, String name1, boolean isCarnivorous1, boolean isWildAnimal1, int livingSpan1) {
        this.color = color1;
        this.name = name1;
        this.isCarnivorous = isCarnivorous1;
        this.isWildAnimal = isWildAnimal1;
        this.livingSpan = livingSpan1;
    }

    private String color;
    private String name;
    private boolean isCarnivorous;
    private boolean isWildAnimal;
    private int livingSpan;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        isCarnivorous = carnivorous;
    }

    public boolean isWildAnimal() {
        return isWildAnimal;
    }

    public void setWildAnimal(boolean wildAnimal) {
        isWildAnimal = wildAnimal;
    }

    public int getLivingSpan() {
        return livingSpan;
    }

    public void setLivingSpan(int livingSpan) {
        this.livingSpan = livingSpan;
    }

    public void eating(){
        System.out.println("eating");
    }
    public void running(){
        System.out.println("running");
    }
    public void sleeping(){
        System.out.println("sleeping");
    }
    public void makingSound(){
        System.out.println("making sound");
    }
}
