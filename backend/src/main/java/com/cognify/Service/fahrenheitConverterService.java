package com.cognify.Service;

import com.cognify.Repository.fahrenheitConverterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fahrenheitConverterService {

    @Autowired
    private fahrenheitConverterRepo repo;

    public fahrenheitConverterService(fahrenheitConverterRepo repo) {
        this.repo = repo;
    }

//    public float getFahrenheit(int value){
//
//        return repo.getFahrenheitRepo(value);
//    }
                            // it give me temperature in celsius
    public float giveCelsius(int value){

        return repo.giveCelsiusRepo(value);
    }
}
