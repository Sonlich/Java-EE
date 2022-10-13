package org.zaika.builder.packing;

public class Wrapper implements Packing{
    public Wrapper(){
    }

    @Override
    public String pack() {
        return "Wrapper for burger";
    }
}
