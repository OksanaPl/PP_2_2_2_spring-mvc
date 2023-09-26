package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryImpl implements CarRepository {
    private List<Car> carsList;

    public CarRepositoryImpl() {

        carsList = new ArrayList<>();

        carsList.add(new Car("Mercedes", "GLA", "diesel"));
        carsList.add(new Car("Mitsubishi", "ASX", "petrol"));
        carsList.add(new Car("BMV", "X7", "diesel"));
        carsList.add(new Car("BMV", "X6", "diesel"));
        carsList.add(new Car("Audi", "Q6", "petrol"));
    }

    @Override
    public List<Car> indexGetCars() {
        return carsList;
    }

}




