public enum Direction {

    NORTH(0), EAST(90), SOUTH(180), WEST(270);

    private final int degrees;

    Direction(int degrees) {
        this.degrees = degrees;
    }
    
    int getDegrees() {
        return this.degrees;
    }

}
