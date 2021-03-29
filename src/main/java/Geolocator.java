import java.awt.*;

public class Geolocator {

    private static final int DEFAULT_PERIMETER = 4;

    private final Point perimeter;
    private Point position;
    private Direction direction;

    public Geolocator() {
        this.perimeter = new Point(DEFAULT_PERIMETER, DEFAULT_PERIMETER);
        this.position = null;
        this.direction = null;
    }

    public Point getPerimeter() {
        return this.perimeter;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Point getPosition() {
        return this.position;
    }

    public Direction getDirection() {
        return this.direction;
    }

}
