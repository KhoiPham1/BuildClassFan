public class Fan {
    int Slow = 1;
    int Medium = 2;
    int Fast = 3;
    private int speed = Slow;

    private boolean on = false;

    private double radius = 5;

    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "speed: " + getSpeed()
                + ", Color: " + getColor()
                + ", Radius: " + getRadius()
                + ( isOn() ? ", fan is on" : ", fan is off");
    }
}
