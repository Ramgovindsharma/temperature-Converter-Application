package com.cognify.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class fahrenheitConverterRepo {

                        //  it changes fahrenheit temperature in calsius
    public float getFahrenheitRepo(int F){
        float C = ((F - 32) * 5/9);
        return C;
    }


                        // it gives temperature in calsius
    public float giveCelsiusRepo(int F){

        return getFahrenheitRepo(F);
    }
}
