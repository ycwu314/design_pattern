package com.example.designpattern.observer.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by ycwu on 2017/8/14.
 */
public class MessageBoard extends Observable {

    private List<String> messageList = new ArrayList<String>();

    public void publish(String message) {
        messageList.add(message);
        setChanged();
        notifyObservers(message);
    }
}
