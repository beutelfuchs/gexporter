package org.surfsite.gexporter;

public class Point {

    double x;
    double y;

    /**
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "|" + getY() + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(getX());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getY());
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX()))
            return false;
        if (Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY()))
            return false;
        return true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
