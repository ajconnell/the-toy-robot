import java.awt.*;

public class DefaultMotor implements Motor {

    @Override
    public void move(Geolocator geolocator) {
        Direction direction = geolocator.getDirection();
        Point position = geolocator.getPosition();

        int currentX = position.x;
        int currentY = position.y;

        switch (direction) {
            case NORTH:
                position.move(currentX, currentY + 1);
                break;
            case EAST:
                position.move(currentX + 1, currentY);
                break;
            case SOUTH:
                position.move(currentX, currentY - 1);
                break;
            case WEST:
                position.move(currentX - 1, currentY);
                break;
        }
    }

}
