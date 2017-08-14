package com.example.designpattern.observer.ex2;

        import java.util.HashSet;
        import java.util.Observable;
        import java.util.Set;

/**
 * Created by ycwu on 2017/8/14.
 */
public class Zoo extends Observable {

    private Set<String> animalSet = new HashSet<String>();

    public void addAnimal(String animal) {
        animalSet.add(animal);
        setChanged();
        notifyObservers(animal);
    }

}
