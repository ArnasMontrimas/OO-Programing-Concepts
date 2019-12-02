package Tiles_Abstraction;

import java.util.Objects;

public abstract class Tile {
    private double height;
    private double width;

    public Tile(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Height = " + height + ", Width = " + width + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return Double.compare(tile.height, height) == 0 &&
                Double.compare(tile.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    public abstract double calcVolume();
}
