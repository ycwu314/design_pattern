package com.example.designpattern.observer.ex2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ycwu on 2017/8/14.
 */
public class AdvertisementMaker implements Observer {

    public void update(Observable o, Object arg) {
        String animal = (String) arg;
        System.out.println("Ad maker: Making ads for new animal [" + animal + "]");
    }
}
