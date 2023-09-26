package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarService carServiceImpl;

    @Autowired
    public CarsController(CarService carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping()
    public String indexCarsTable(
            @RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
            Model model
    ) {
        model.addAttribute("cars", carServiceImpl.indexGetCars(count));
        return "cars";
    }

}
