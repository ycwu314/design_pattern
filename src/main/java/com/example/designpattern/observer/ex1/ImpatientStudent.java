package com.example.designpattern.observer.ex1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ycwu on 2017/8/14.
 */

public class ImpatientStudent extends Student implements Observer {

    private String interestedOf;

    public ImpatientStudent(int id, String interestedOf) {
        super(id);
        this.interestedOf = interestedOf;
    }

    public void update(Observable o, Object arg) {
        String message = (String) arg;
        if (message.indexOf(interestedOf) == -1) {
            System.out.println("impatient student " + super.id + " drop for missing " + interestedOf);
            MessageBoard board = (MessageBoard) o;
            board.deleteObserver(this);
        } else {
            super.update(o, arg);
        }
    }
}
