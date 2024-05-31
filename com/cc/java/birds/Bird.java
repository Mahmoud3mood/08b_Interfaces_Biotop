package com.cc.java.birds;

import com.cc.java.interfaces.Feather;
import com.cc.java.interfaces.Flyable;

public class Bird implements Flyable, Feather{

    @Override
    public String fly() {
        // TODO Auto-generated method stub
        return "i can fly at 20 mph";
    }

    @Override
    public String hasFeathers() {
        // TODO Auto-generated method stub
        return "I'm a bird, I have feathers!";
    }

    
}
