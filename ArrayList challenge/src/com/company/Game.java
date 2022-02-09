package com.company;

public class Game {

    private String name;
    public int price;

    public Game(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void printGame()
    {
        System.out.println("Game:"+this.name+" Price:"+this.price);
    }

}
