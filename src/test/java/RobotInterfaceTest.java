import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;

public class RobotInterfaceTest {

    @Test
    public void assertDefaultPlaceThrowsIllegalArgumentException() {
        Robot robotInterface = spy(Robot.class);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            robotInterface.place(0, 0, Direction.NORTH);
        });
    }

    @Test
    public void assertDefaultMoveThrowsIllegalArgumentException() {
        Robot robotInterface = spy(Robot.class);
        Assertions.assertThrows(IllegalArgumentException.class, robotInterface::move);
    }

    @Test
    public void assertDefaultLeftThrowsIllegalArgumentException() {
        Robot robotInterface = spy(Robot.class);
        Assertions.assertThrows(IllegalArgumentException.class, robotInterface::left);
    }

    @Test
    public void assertDefaultRightThrowsIllegalArgumentException() {
        Robot robotInterface = spy(Robot.class);
        Assertions.assertThrows(IllegalArgumentException.class, robotInterface::right);
    }

}
