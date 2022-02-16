package com.vinh.demo;

import org.springframework.stereotype.Component;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        System.out.println("create object...");
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void show() {
        System.out.println("in show testing");
    }
}
