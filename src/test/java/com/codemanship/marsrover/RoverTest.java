package com.codemanship.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RoverTest
{

    @Test
    public void rover_can_be_initialized(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Rover rover = new Rover(Direction.NORTH);
        Assertions.assertNotNull(rover);
    }

    @Test
    void rotateRightFromNorth()
    {
        Rover rover = new Rover(Direction.NORTH);
        rover.turnRight();
        Assertions.assertEquals(Direction.EAST, rover.getOrientation());
    }

    @Test
    void rotateRightFromEast()
    {
        Rover rover = new Rover(Direction.EAST);
        rover.turnRight();
        Assertions.assertEquals(Direction.SOUTH, rover.getOrientation());
    }


    @Test
    void rotateRightFromSouth()
    {
        Rover rover = new Rover(Direction.SOUTH);
        rover.turnRight();
        Assertions.assertEquals(Direction.WEST, rover.getOrientation());
    }

    @Test
    void rotateRightFromWest()
    {
        Rover rover = new Rover(Direction.WEST);
        rover.turnRight();
        Assertions.assertEquals(Direction.NORTH, rover.getOrientation());
    }
}
