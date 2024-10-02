package marsrover;

public class RoverComponent {
    private final Rover rover;
    private final Grid grid;

    public RoverComponent(Rover rover, Grid grid) {
        this.rover = rover;
        this.grid = grid;
    }

    public void move() {
        if (!grid.isObstacle(rover.getPosition())) {
            rover.move();
        }
    }
}