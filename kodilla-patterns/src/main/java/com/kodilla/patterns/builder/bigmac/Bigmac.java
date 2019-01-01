package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bun,burgers,sauce,ingredients);
        }
    }

    public Bigmac(final String bun,final int burgers,final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "Bun ='" + bun + '\'' +
                ", Burgers =" + burgers +
                ", Sauce ='" + sauce + '\'' +
                ", Ingredients =" + ingredients +
                '}';
    }
}