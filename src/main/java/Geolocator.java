import java.awt.*;

public class Geolocator {

    private Point position;
    private Direction direction;

    public Geolocator() {
        this.position = null;
        this.direction = null;
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
