package com.udacity.session.demosix.demo;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private EngineService engineService;

    public VehicleService(EngineService engineService){
        this.engineService = engineService;
    }

    public void turnCarKey(){
        System.out.println("key turned");
        engineService.startUpEngine();
    }
}
