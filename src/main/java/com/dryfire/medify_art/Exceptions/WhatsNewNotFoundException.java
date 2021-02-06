package com.dryfire.medify_art.Exceptions;

public class WhatsNewNotFoundException extends RuntimeException{

    public WhatsNewNotFoundException(Long id){
        super("What's New not found exception: " + id);
    }
}
