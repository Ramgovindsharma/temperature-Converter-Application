package com.cognify.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class CelsiusConverterRepo {

                            // it changes celsius temperature in fahrenheit
    public float getCelsiusRepo(int C){
       float F= (( C * 9/5 ) + 32);
       return F;
    }

                                // it gives temperature in fahrenheit
    public float giveFahrenheitRepo(int C){

        return getCelsiusRepo(C);
    }
}
