package com.walking.lesson16_abstract_class_interface.task2.model;

public class Bye implements Greeting{

    @Override
    public String printReply() {
        return REPLY_BYE;
    }
}