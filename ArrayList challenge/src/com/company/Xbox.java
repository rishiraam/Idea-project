package com.company;

import java.util.ArrayList;
import java.util.List;

public class Xbox {
    
    private String name;
    private List<Game> games;

    public Xbox(String name) {
        this.name = name;
        this.games=new ArrayList<Game>();
    }
    
    public void add(String name,int price)
    {
        for(int i=0;i<games.size();i++) 
        {
            if (games.get(i).getName().equals(name)) {
                System.out.println("Already present");
                return;
            }

        }
        Game g=new Game(name,price);
        games.add(g);
    }

    public void print()
    {
        for(Game g: this.games)
        {
            g.printGame();
        }
    }
}
