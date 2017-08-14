package com.example.designpattern.observer.ex2;

/**
 * Created by ycwu on 2017/8/14.
 */
public class Main {
    public static void main(String[] args) {
        AdvertisementMaker adMaker = new AdvertisementMaker();
        AnimalDoctor doctor = new AnimalDoctor();
        Zookeeper zookeeper = new Zookeeper();

        Zoo zoo = new Zoo();
        zoo.addObserver(doctor);
        zoo.addObserver(zookeeper);
        zoo.addObserver(adMaker);

        zoo.addAnimal("zebra");
        zoo.addAnimal("lion");
    }
}
