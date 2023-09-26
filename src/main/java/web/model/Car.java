package web.model;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String fuel;

    public Car() {

    }

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public String getFuel() {
        return fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(fuel, car.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, fuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}

