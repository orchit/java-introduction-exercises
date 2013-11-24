package de.orchit.java.excercise;


public class Bike {
    private int speed;
    private double direction;
    private double posX;
    private double posY;

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void move() {
        //first get the direction the bike is moving in
        double directionX = Math.cos(Math.toRadians(direction));
        double directionY = Math.sin(Math.toRadians(direction));

        //normalize the vector
        double length = Math.sqrt(directionX * directionX + directionY * directionY);
        if (length > 0) {
            directionX = directionX * (1 / length);
            directionY = directionY * (1 / length);
        }
        //verify that the direction vector is normalized
        //assert (Math.abs(Math.sqrt(directionX * directionX + directionY * directionY) - 1) < 0.001);

        applyMovement(directionX, directionY);
    }

    protected void applyMovement(double directionX, double directionY) {
        posX += directionX * speed;
        posY += directionY * speed;
    }
}
