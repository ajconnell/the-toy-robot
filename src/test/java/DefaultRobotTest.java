import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefaultRobotTest {

    @Test
    public void assertPlaceDoesNotThrowIllegalArgumentException() {
        DefaultRobot robot = new DefaultRobot();
        Assertions.assertDoesNotThrow(robot::place);
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