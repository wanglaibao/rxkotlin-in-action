package com.laibao.rxjava.fundamental.reactiveextensions;

import java.io.Serializable;

/**
 * @author laibao wang
 */
public class Tweet implements Serializable{

    private long id;

    private String name;

    public Tweet(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
