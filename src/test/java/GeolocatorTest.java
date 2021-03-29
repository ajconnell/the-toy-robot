import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

class GeolocatorTest {

    @Test
    public void assertGeolocatorPositionAndDirectionNullOnCreation() {
        Geolocator geolocator = new Geolocator();
        Assertions.assertNull(geolocator.getPosition());
        Assertions.assertNull(geolocator.getDirection());
    }

    @Test
    public void assertGeolocatorCorrectlyReturnsDefinedPositionAndDirectionAfterAssignment() {
        Geolocator geolocator = new Geolocator();
        geolocator.setDirection(Direction.EAST);
        geolocator.setPosition(new Point(3, 3));

        Assertions.assertEquals(Direction.EAST, geolocator.getDirection());
        Assertions.assertEquals(3, geolocator.getPosition().x);
        Assertions.assertEquals(3, geolocator.getPosition().y);
    }

}