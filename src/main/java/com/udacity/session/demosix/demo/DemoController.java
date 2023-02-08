package com.udacity.session.demosix.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
    private VehicleService vehicleService;
    public DemoController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @GetMapping("mine")
    public String myDemoMethod(){
        vehicleService.turnCarKey();
        return "signup";
    }
}
