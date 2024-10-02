package marsrover;

import java.util.Objects;

public class Rover {
    private Position position;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.position = new Position(x, y);
        this.direction = direction;
    }

    public void move() {
        position = position.move(direction);
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void statusReport() {
        System.out.println("Rover is at " + position + " facing " + direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(position, rover.position) &&
                direction == rover.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, direction);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}