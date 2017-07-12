package com.example.tybee.james2017summer.audio;

import java.io.Serializable;

/**
 * Created by tybee on 6/21/2017.
 */

public class BaseBean implements Serializable{

    private String bean;

    public String getName() {
        return bean;
    }

    public void setName(String bean) {
        this.bean = bean;
    }
}
