package marsrover;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public Direction turnLeft() {
        return values()[(ordinal() + 3) % values().length];
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % values().length];
    }
}