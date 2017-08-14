package com.example.designpattern.observer.ex1;

/**
 * Created by ycwu on 2017/8/14.
 */
public class Main {

    public static void main(String[] args) {
        MessageBoard messageBoard = new MessageBoard();
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        Student s3 = new Student(3);
        ImpatientStudent s4 = new ImpatientStudent(4, "prize");

        messageBoard.addObserver(s1);
        messageBoard.addObserver(s2);
        messageBoard.addObserver(s3);
        messageBoard.addObserver(s4);

        messageBoard.publish("prize");
        messageBoard.publish("hello world");
    }
}
