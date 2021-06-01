package com.nofish.box;

public class Box1 extends Box {

    public Box1() {
        length = 5;
        height = 10;
        width = 10;
    }

    @Override
    public String getName() {
        return "Box 1";
    }

    @Override
    public int getPrice() {
        return 40;
    }
}
