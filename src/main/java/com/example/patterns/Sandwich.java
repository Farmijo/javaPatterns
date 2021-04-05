// Builder pattern
package com.example.patterns;

public class Sandwich {
    public final int breadSlices;
    public final int cheeseSlices;
    public final int hamSlices;
    public final int tomatoSlices;
    public final int cucumberSlices;

    public static class Builder {

        //required parameters
        private final int breadSlices;

        //optional parameters (with default values)
        private int cheeseSlices = 0;
        private int hamSlices = 0;
        private int tomatoSlices = 0;
        private int cucumberSlices = 0;

        public Builder(int breadSlices) {
            this.breadSlices = breadSlices;
        }
        public Builder hamSlices(int value) {
            hamSlices = value;
            return this;
        }
        public Builder cheeseSlices(int value) {
            cheeseSlices = value;
            return this;
        }
        public Builder tomatoSlices(int value) {
            tomatoSlices = value;
            return this;
        }
        public Builder cucumberSlices(int value) {
            cucumberSlices = value;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }

    private Sandwich(Builder builder){
        this.breadSlices = builder.breadSlices;
        this.cheeseSlices = builder.breadSlices;
        this.cucumberSlices = builder.cucumberSlices;
        this.hamSlices = builder.hamSlices;
        this.tomatoSlices = builder.hamSlices;
    }
}
