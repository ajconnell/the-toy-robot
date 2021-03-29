import java.awt.*;

public class DefaultRobot implements Robot {

    private final Geolocator geolocator;

    public DefaultRobot() {
        this.geolocator = new Geolocator(null, null);
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

}
