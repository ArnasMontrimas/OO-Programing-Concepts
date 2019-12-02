package Tiles_Abstraction;

import java.util.Objects;

public class StoneTile extends Tile {
    private double depth;

    public StoneTile(double height, double weight, double depth) {
        super(height,weight);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return super.toString() + "Depth = " + depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StoneTile stoneTile = (StoneTile) o;
        return Double.compare(stoneTile.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), depth);
    }

    public double calcVolume() {
        return getHeight()*getWidth()*depth;
    }
}
