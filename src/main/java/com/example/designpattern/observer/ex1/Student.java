package com.example.designpattern.observer.ex1;

import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ycwu on 2017/8/14.
 */
@NoArgsConstructor
public class Student implements Observer {

    protected int id;

    public Student(int id) {
        this.id = id;
    }

    public void update(Observable o, Object arg) {
        String message = (String) arg;
        System.out.println("student " + id + " got the message[" + message + "]");
    }
}
