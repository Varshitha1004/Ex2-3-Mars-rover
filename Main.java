package marsrover;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        Rover rover = new Rover(0, 0, Direction.NORTH);
        RoverComponent roverComponent = new RoverComponent(rover, grid);

        Command[] commands = {
                new MoveCommand(rover),
                new MoveCommand(rover),
                new TurnRightCommand(rover),
                new MoveCommand(rover),
                new TurnLeftCommand(rover),
                new MoveCommand(rover)
        };

        for (Command command : commands) {
            command.execute();
        }

        rover.statusReport();
    }
}