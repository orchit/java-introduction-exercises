package de.orchit.java.excercise;

public class MountainBike extends Bike{
    private int gear;
    private int seatHeight;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    protected void applyMovement(double directionX, double directionY) {
        super.applyMovement(directionX*gear, directionY*gear);
    }
}
