package com.nofish.box;

public class Box4 extends Box {
    public Box4() {
        length = 15;
        width = 10;
        height = 10;
    }
    @Override
    public String getName() {
        return "Box 4";
    }

    @Override
    public int getPrice() {
        return 70;
    }

}
