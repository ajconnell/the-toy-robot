import java.awt.*;

public interface GeolocatableRobot extends Robot {

    default Point getPosition() {
        throw new IllegalArgumentException("Behaviour for <getPosition> method not defined.");
    }

    default Direction getDirection() {
        throw new IllegalArgumentException("Behaviour for <getDirection> method not defined.");
    }

}
