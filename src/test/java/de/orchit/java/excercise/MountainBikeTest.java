package de.orchit.java.excercise;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MountainBikeTest {

    @Test
    public void speed1Gear1StillTheSame() {
        MountainBike bike = new MountainBike();
        bike.setPosX(0);
        bike.setPosY(0);
        bike.setSpeed(1);
        bike.setDirection(0);
        bike.setGear(1);

        bike.move();
        assertEquals(1, bike.getPosX(), 0.001);
        assertEquals(0, bike.getPosY(), 0.001);
    }
    @Test
    public void speed1Gear2TwiceAsFast() {
        MountainBike bike = new MountainBike();
        bike.setPosX(0);
        bike.setPosY(0);
        bike.setSpeed(1);
        bike.setDirection(0);
        bike.setGear(2);

        bike.move();
        assertEquals(2, bike.getPosX(), 0.001);
        assertEquals(0, bike.getPosY(), 0.001);
    }

    @Test
    public void speed2Gear3AlmostLightSpeed() {
        MountainBike bike = new MountainBike();
        bike.setPosX(0);
        bike.setPosY(0);
        bike.setSpeed(2);
        bike.setDirection(0);
        bike.setGear(3);

        bike.move();
        assertEquals(6, bike.getPosX(), 0.001);
        assertEquals(0, bike.getPosY(), 0.001);
    }
}
