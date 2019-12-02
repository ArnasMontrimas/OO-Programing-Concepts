package Tiles_Abstraction;

import java.util.Objects;

public class CeramicTile extends Tile {
    private String surfaceFinish;

    public CeramicTile(double height, double width, String surfaceFinish) {
        super(height,width);
        this.surfaceFinish = surfaceFinish;
    }

    public String getSurfaceFinish() {
        return surfaceFinish;
    }

    public void setSurfaceFinish(String surfaceFinish) {
        this.surfaceFinish = surfaceFinish;
    }

    @Override
    public String toString() {
        return super.toString() + "Surface Finish = " + surfaceFinish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CeramicTile that = (CeramicTile) o;
        return surfaceFinish.equals(that.surfaceFinish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), surfaceFinish);
    }

    public double calcVolume() {
        return getWidth()*getHeight()*1;
    }

}
