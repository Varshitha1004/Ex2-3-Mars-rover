package marsrover;

import java.util.HashSet;
import java.util.Set;

public class Grid {
    private final int size;
    private final Set<Position> obstacles;

    public Grid(int size) {
        this.size = size;
        this.obstacles = new HashSet<>();
    }

    public void addObstacle(int x, int y) {
        obstacles.add(new Position(x, y));
    }

    public boolean isObstacle(Position position) {
        return obstacles.contains(position);
    }
}