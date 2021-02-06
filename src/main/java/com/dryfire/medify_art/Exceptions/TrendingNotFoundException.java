package com.dryfire.medify_art.Exceptions;

public class TrendingNotFoundException extends RuntimeException{

    public TrendingNotFoundException(Long id){
        super("Trending is not found exception: " + id);
    }
}
