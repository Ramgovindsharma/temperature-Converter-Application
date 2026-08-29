package com.cognify.Service;

import com.cognify.Repository.CelsiusConverterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CelsiusConverterService {
    @Autowired
    private CelsiusConverterRepo repo;

    public CelsiusConverterService(CelsiusConverterRepo repo) {
        this.repo = repo;
    }
//
//    public void getCelsius(int value){
//         repo.getCelsiusRepo(value);
//    }
                                     // it gives me temperature in fahrenheit
    public float giveFahrenheit(int value){

        return repo.giveFahrenheitRepo(value);
    }


}
