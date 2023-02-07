public class Picape extends Car{
    public Picape(int speed, String color, int year, int carSong, String name, String pickupClass, String pickupTrunkSize) {
        super(speed, color, year, carSong, name);
        this.pickupClass = pickupClass;
        this.pickupTrunkSize =  pickupTrunkSize;

    }
    private String pickupTrunkSize;

    private String pickupClass;

    public String getPickupTrunkSize() {
        return pickupTrunkSize;
    }

    public String getPickupClass() {
        return pickupClass;
    }

    @Override
    public void print() {
        System.out.println("Скорость: " + getSpeed() + " " + "Цвет: " + getColor() + " " + "Год выпуска: " + getYear() + " " + "Модель: " + getName() + "Класс: " + getPickupClass() + " " + "Размер Багажа: " + getPickupTrunkSize());
    }
}
