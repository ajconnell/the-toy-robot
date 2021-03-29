import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefaultRobotTest {

    @Test
    public void assertPlaceDoesNotThrowIllegalArgumentException() {
        DefaultRobot robot = new DefaultRobot();
        Assertions.assertDoesNotThrow(() -> {
            robot.place(0, 0, Direction.NORTH);
        });
    }

    @Test
    public void assertPlaceCorrectlyPositionsRobot() {
        int xPosition = 4;
        int yPosition = 2;
        Direction west = Direction.WEST;

        DefaultRobot robot = new DefaultRobot();
        robot.place(xPosition, yPosition, west);

        Assertions.assertEquals(xPosition, robot.getPosition().x);
        Assertions.assertEquals(yPosition, robot.getPosition().y);
        Assertions.assertEquals(west, robot.getDirection());
    }

    @Test
    public void assertMoveDoesNotThrowIllegalArgumentException() {
        int xPosition = 10;
        int yPosition = 5;
        Direction south = Direction.SOUTH;

        DefaultRobot robot = new DefaultRobot();
        robot.place(xPosition, yPosition, south);

        Assertions.assertDoesNotThrow(robot::move);
        Assertions.assertEquals(xPosition, robot.getPosition().x);
        Assertions.assertEquals(yPosition - 1, robot.getPosition().y);
    }

    @Test
    public void assertLeftDoesNotThrowIllegalArgumentException() {
        int xPosition = 5;
        int yPosition = 0;
        Direction north = Direction.NORTH;

        DefaultRobot robot = new DefaultRobot();
        robot.place(xPosition, yPosition, north);

        Assertions.assertDoesNotThrow(robot::left);
        Assertions.assertEquals(Direction.WEST, robot.getDirection());
    }

    @Test
    public void assertRightDoesNotThrowIllegalArgumentException() {
        int xPosition = 8;
        int yPosition = 2;
        Direction west = Direction.WEST;

        DefaultRobot robot = new DefaultRobot();
        robot.place(xPosition, yPosition, west);
        Assertions.assertDoesNotThrow(robot::right);
        Assertions.assertEquals(Direction.NORTH, robot.getDirection());
    }

}