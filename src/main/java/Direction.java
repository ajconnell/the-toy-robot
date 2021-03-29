public enum Direction {

    NORTH(0), EAST(90), SOUTH(180), WEST(270);

    private final int degrees;

    Direction(int degrees) {
        this.degrees = degrees;
    }

    int getDegrees() {
        return this.degrees;
    }

    static Direction getDirectionForDegrees(int degrees) {
        switch (degrees % 360) {
            case 0:
                return NORTH;
            case 90:
                return EAST;
            case 180:
                return SOUTH;
            case 270:
                return WEST;
            default:
                throw new IllegalArgumentException("Direction not identified for given number of degrees");
        }
    }

}
