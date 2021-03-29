public interface Robot {

    default void place() {
        throw new IllegalArgumentException("Behaviour for <place> method not defined.");
    }

    default void move() {
        throw new IllegalArgumentException("Behaviour for <move> method not defined.");
    }

    default void left() {
        throw new IllegalArgumentException("Behaviour for <left> method not defined.");
    }

    default void right() {
        throw new IllegalArgumentException("Behaviour for <right> method not defined.");
    }

}
