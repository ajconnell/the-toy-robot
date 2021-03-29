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
        DefaultRobot robot = new DefaultRobot();
        Assertions.assertDoesNotThrow(robot::move);
    }

    @Test
    public void assertLeftDoesNotThrowIllegalArgumentException() {
        DefaultRobot robot = new DefaultRobot();
        Assertions.assertDoesNotThrow(robot::left);
    }

    @Test
    public void assertRightDoesNotThrowIllegalArgumentException() {
        DefaultRobot robot = new DefaultRobot();
        Assertions.assertDoesNotThrow(robot::right);
    }

}