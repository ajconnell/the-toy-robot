import java.awt.*;

public class DefaultRobot implements Robot {

    private Point position;
    private Direction direction;

    public DefaultRobot() {
        this.position = null;
        this.direction = null;
    }

    @Override
    public void place(int xPosition, int yPosition, Direction direction) {
        this.position = new Point(xPosition, yPosition);
        this.direction = direction;
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
