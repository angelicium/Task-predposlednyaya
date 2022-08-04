package web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;

    public CarController() {
        this.carService = new CarService();
    }

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @RequestParam(value = "count",required = false,defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}