package Tiles_Abstraction;

public class TilesApp {
    public static void main(String[] args) {
        //Creating Objects
        Tile ceramic1 = new CeramicTile(3,5,"Gloss");
        Tile ceramic2 = new CeramicTile(3,5,"Matt");
        Tile stone1 = new StoneTile(5,5,5);
        Tile stone2 = new StoneTile(3,3,3);
        Tile stone3 = new StoneTile(3,3,3);

        TileStore myTiles = new TileStore();

        //Comparing by memory location
        if(ceramic1 == ceramic2) {
            System.out.println("Same place in memory");
        }
        else {
            System.out.println("Different memory location");
        }

        //Comparing by data content
        if(ceramic1.equals(ceramic2)) {
            System.out.println("Same data content");
        }
        else System.out.println("Different data content");

        //Testing methods in TileStore class
        myTiles.addTile(ceramic1);
        myTiles.addTile(ceramic2);
        myTiles.addTile(stone1);
        myTiles.addTile(stone2);
        myTiles.addTile(stone3);

        myTiles.findCeramicTilesByFinish("Matt");
        System.out.println(myTiles.getAvgVolume());
        System.out.println(myTiles.numberOfTilesOfParticularType(stone1));

    }
}
