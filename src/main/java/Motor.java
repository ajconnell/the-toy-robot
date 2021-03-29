import java.awt.*;

public interface Motor {

    default void move(Geolocator geolocator) {
        throw new IllegalArgumentException("Behaviour for <move> method not defined.");
    }

}
