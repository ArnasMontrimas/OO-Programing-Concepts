package Tiles_Abstraction;

import java.util.ArrayList;

public class MyTiles {
    private ArrayList<Tile> myTiles;

    public MyTiles() {
        myTiles = new ArrayList<>();
    }

    public boolean addTile(Tile tile) {
        return myTiles.add(tile);
    }
}
