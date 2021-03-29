import java.awt.*;

public class DefaultMotor implements Motor {

    @Override
    public void move(Geolocator geolocator) {
        Direction direction = geolocator.getDirection();
        Point position = geolocator.getPosition();
        Point perimeter = geolocator.getPerimeter();

        int currentX = position.x;
        int currentY = position.y;

        switch (direction) {
            case NORTH:
                if (currentY < perimeter.y) {
                    position.move(currentX, currentY + 1);
                }
                break;
            case EAST:
                if (currentX < perimeter.x) {
                    position.move(currentX + 1, currentY);
                }
                break;
            case SOUTH:
                if (currentY > 0) {
                    position.move(currentX, currentY - 1);
                }
                break;
            case WEST:
                if (currentX > 0) {
                    position.move(currentX - 1, currentY);
                }
                break;
        }
    }

}
