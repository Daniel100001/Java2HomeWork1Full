public class Car extends Transport{

    private String carType;

    private int carSong;

    private String name;

    public Car(int speed, String color, int year,int carSong,String name) {
        super(speed, color, year);
        this.carSong = carSong;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Скорость: " + getSpeed() + " " + "Цвет: " + getColor() + " " + "Год выпуска: " + getYear() + " " + "Модель: " + getName());
    }

    public String getCarType() {
        return carType;
    }

    public int getCarSong() {
        return carSong;
    }

    public String getName() {
        return name;
    }
}
