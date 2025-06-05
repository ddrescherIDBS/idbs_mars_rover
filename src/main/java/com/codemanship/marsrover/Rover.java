package com.codemanship.marsrover;

import java.util.ArrayList;
import java.util.List;

public class Rover
{
    private Direction direction;

    public Rover(Direction initialDirection) {
        direction = initialDirection;
    }

    public Direction getOrientation()
    {
        return direction;
    }

    public void turnRight()
    {
        List<Direction> dirs = new ArrayList<>();
        dirs.add(Direction.NORTH);
        dirs.add(Direction.EAST);
        dirs.add(Direction.SOUTH);
        dirs.add(Direction.WEST);
        int p = (dirs.indexOf(direction) + 1) % 4;
        direction = dirs.get(p);
    }

    public void turnLeft()
    {
        List<Direction> dirs = new ArrayList<>();
        dirs.add(Direction.WEST);
        dirs.add(Direction.SOUTH);
        dirs.add(Direction.EAST);
        dirs.add(Direction.NORTH);
        int p = (dirs.indexOf(direction) + 1) % 4;
        direction = dirs.get(p);
    }
}
