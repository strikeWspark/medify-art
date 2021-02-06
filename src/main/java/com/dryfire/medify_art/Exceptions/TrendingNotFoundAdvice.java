package com.dryfire.medify_art.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TrendingNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(TrendingNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String trendingNotFoundHandler(TrendingNotFoundException ex){
        return ex.getMessage();
    }

}
