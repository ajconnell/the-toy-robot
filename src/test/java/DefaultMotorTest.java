import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class DefaultMotorTest {

    @Test
    public void assertShouldFacilitateMoveNorthWhenNotAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.NORTH);
        geolocator.setPosition(new Point(4, 3));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(4, geolocator.getPosition().y);
    }

    @Test
    public void assertShouldFacilitateMoveSouthWhenNotAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.SOUTH);
        geolocator.setPosition(new Point(4, 1));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(0, geolocator.getPosition().y);
    }

    @Test
    public void assertShouldFacilitateMoveEastWhenNotAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.EAST);
        geolocator.setPosition(new Point(3, 3));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(4, geolocator.getPosition().x);
    }

    @Test
    public void assertShouldFacilitateMoveWestWhenNotAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.WEST);
        geolocator.setPosition(new Point(1, 3));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(0, geolocator.getPosition().x);
    }

    @Test
    public void assertShouldNotMoveNorthWhenAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.NORTH);
        geolocator.setPosition(new Point(4, 4));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(4, geolocator.getPosition().y);
    }

    @Test
    public void assertShouldNotMoveSouthWhenAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.SOUTH);
        geolocator.setPosition(new Point(4, 0));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(0, geolocator.getPosition().y);
    }

    @Test
    public void assertShouldNotMoveEastWhenAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.EAST);
        geolocator.setPosition(new Point(4, 3));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(4, geolocator.getPosition().x);
    }

    @Test
    public void assertShouldNotMoveWestWhenAtEdgeOfBoard() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.WEST);
        geolocator.setPosition(new Point(0, 3));

        DefaultMotor motor = new DefaultMotor();
        motor.move(geolocator);

        Assertions.assertEquals(0, geolocator.getPosition().x);
    }

}