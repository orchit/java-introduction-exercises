package de.orchit.java.excercise;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BikeTest {

    @Test
    public void goStraightForward() {
        Bike bike = new Bike();
        bike.setPosX(0);
        bike.setPosY(0);
        bike.setSpeed(1);
        bike.setDirection(0);

        bike.move();
        assertEquals(1, bike.getPosX(), 0.001);
        assertEquals(0, bike.getPosY(), 0.001);
    }

    @Test
    public void goRight() {
        Bike bike = new Bike();
        bike.setPosX(0);
        bike.setPosY(0);
        bike.setSpeed(1);
        bike.setDirection(90);

        bike.move();
        assertEquals(0, bike.getPosX(), 0.001);
        assertEquals(1, bike.getPosY(), 0.001);
    }

    @Test
    public void goLeft() {
        Bike bike = new Bike();
        bike.setPosX(0);
        bike.setPosY(0);
        bike.setSpeed(1);
        bike.setDirection(-90);

        bike.move();
        assertEquals(0, bike.getPosX(), 0.001);
        assertEquals(-1, bike.getPosY(), 0.001);
    }
}
