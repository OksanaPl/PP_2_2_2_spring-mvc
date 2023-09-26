package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.repository.CarRepository;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> indexGetCars(int count) {
        return carRepository.indexGetCars()
                .stream()
                .limit(count)
                .toList();
    }
}
