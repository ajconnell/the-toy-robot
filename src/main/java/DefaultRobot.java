import java.awt.*;

public class DefaultRobot implements GeolocatableRobot {

    private static final int NINETY_DEGREES = 90;

    private final Geolocator geolocator;
    private final Motor motor;

    public DefaultRobot() {
        this.geolocator = new Geolocator();
        this.motor = new DefaultMotor();
    }

    @Override
    public void place(int xPosition, int yPosition, Direction direction) {
        geolocator.setPosition(new Point(xPosition, yPosition));
        geolocator.setDirection(direction);
    }

    @Override
    public void move() {
        motor.move(geolocator);
    }

    @Override
    public void left() {
        int currentDegrees = geolocator.getDirection().getDegrees();
        geolocator.setDirection(Direction.getDirectionForDegrees((currentDegrees - NINETY_DEGREES)));
    }

    @Override
    public void right() {
        int currentDegrees = geolocator.getDirection().getDegrees();
        geolocator.setDirection(Direction.getDirectionForDegrees(currentDegrees + NINETY_DEGREES));
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
