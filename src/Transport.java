public abstract class Transport implements Printable {
    public Transport(int speed, String color, int year) {
        this.speed = speed;
        this.color = color;
        this.year = year;
    }

    private String color;
    private int year;


    private int speed;

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
