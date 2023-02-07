public class SportCar extends Car{

    public SportCar(int speed, String color, int year, int carSong, String name,int startingSpeed, String wheelType) {
        super(speed, color, year, carSong, name);
        this.startingSpeed = startingSpeed;
        this.wheelType = wheelType;
    }
    private int startingSpeed;

    private String wheelType;
    @Override
    public void print(){
        System.out.println("Скорость: " + getSpeed() + " " + "Цвет: " + getColor() + " " + "Год выпуска: " + getYear() + " " + "Модель: " + getName() + " " + "Стартовая скорость: " + getStartingSpeed() + " " + "Тип колеса: " + getWheelType());
    }

    public int getStartingSpeed() {
        return startingSpeed;
    }

    public String getWheelType() {
        return wheelType;
    }
}
