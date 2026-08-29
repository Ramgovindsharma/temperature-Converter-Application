package com.cognify.Controller;

import com.cognify.Entities.celsiusEntity;
import com.cognify.Service.CelsiusConverterService;
import com.cognify.Service.fahrenheitConverterService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/converter")
@CrossOrigin(origins = "http://localhost:5173")
public class celsiusController {


    private CelsiusConverterService celsius;


    private fahrenheitConverterService fahrenheit;
    @Autowired
    public celsiusController(CelsiusConverterService celsius, fahrenheitConverterService fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    //    @GetMapping("/fahrenheit")
//    public void getCelsius(@PathVariable float fahrenheit){
//
//         celsius.getCelsius((int) fahrenheit);
//
//    }


    @PostMapping("/show")
    public float giveFahrenheit(@RequestBody celsiusEntity entity){
        System.out.println(entity.getNumber());
        return celsius.giveFahrenheit((int) entity.getNumber());
    }

    public float giveCalsius(@PathVariable float calsius){
        return fahrenheit.giveCelsius((int) calsius);
    }
    @RequestMapping("/name")
    public String name(){

        return "hello";
    }

    @PostConstruct
    public void show(){
        //System.out.println(giveFahrenheit(50));

    }
}


