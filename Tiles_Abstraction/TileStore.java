package Tiles_Abstraction;

import java.util.ArrayList;

public class TileStore {
    private ArrayList<Tile> myTiles;

    public TileStore() {
        this.myTiles = new ArrayList<>();
    }

    public boolean addTile(Tile tile) {
        return myTiles.add(tile);
    }

    public double getAvgVolume() {
        double total = 0, avg;
        for(Tile t: myTiles) {
            total += t.calcVolume();
        }
        avg = total/myTiles.size();
        return avg;
    }

    public void findCeramicTilesByFinish(String finish){
        for(Tile t: myTiles) {
            if(t instanceof CeramicTile) {
                if(((CeramicTile) t).getSurfaceFinish().equals(finish)) {
                    System.out.println(t.toString());
                }
            }
        }
    }

    public int numberOfTilesOfParticularType(Tile tile) {
        int num = 0;
        for(Tile t: myTiles) {
            if(t.getClass() == tile.getClass()) {
                num++;
            }
        }
        return num;
    }

}
