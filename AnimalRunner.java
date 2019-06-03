package com.trimindtech.training.day03;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal lion = new Animal("brown","lion",true,true,25);
        /*lion.eating();
        lion.running();
        lion.sleeping();
        lion.makingSound();
        System.out.println(lion);*/
        lion.setColor("yellow");
        System.out.println(lion.getColor());
        lion.setName("tiger");
        System.out.println(lion.getName());
        lion.setLivingSpan(30);
        System.out.println(lion.getLivingSpan());
    }
}
