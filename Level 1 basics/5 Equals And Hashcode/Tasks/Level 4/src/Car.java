public class Car {
    String plateNumber;
    String color;

    public Car(String plateNumber, String color) {
        this.plateNumber = plateNumber;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Car car = (Car) obj;

        return plateNumber.equals(car.plateNumber);
    }

    @Override
    public int hashCode() {
        return plateNumber.hashCode();
    }
}
