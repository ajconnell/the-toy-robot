public class DefaultRobot implements Robot {

    private int xPosition;
    private int yPosition;
    private Direction direction;

    @Override
    public void place(int xPosition, int yPosition, Direction direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
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
