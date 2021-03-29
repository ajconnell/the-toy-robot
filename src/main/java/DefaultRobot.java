import java.awt.*;

public class DefaultRobot implements GeolocatableRobot {

    private final Geolocator geolocator;

    public DefaultRobot() {
        this.geolocator = new Geolocator();
    }

    @Override
    public void place(int xPosition, int yPosition, Direction direction) {
        geolocator.setPosition(new Point(xPosition, yPosition));
        geolocator.setDirection(direction);
    }

    @Override
    public void move() {

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }

    @Override
    public Point getPosition() {
        return geolocator.getPosition();
    }

    @Override
    public Direction getDirection() {
        return geolocator.getDirection();
    }

}
