package com.dryfire.medify_art.Controllers;

import com.dryfire.medify_art.Exceptions.WhatsNewNotFoundException;
import com.dryfire.medify_art.Models.WhatsNew;
import com.dryfire.medify_art.Repositories.WhatsNewRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class WhatsNewController {

    private final WhatsNewRepository whatsNewRepository;

    public WhatsNewController(WhatsNewRepository whatsNewRepository){
        this.whatsNewRepository = whatsNewRepository;
    }

    @GetMapping("/whatsnew")
    List<WhatsNew> all(){

        return whatsNewRepository.findAll();
    }

    @GetMapping("/whatsnew/{id}")
    WhatsNew one(@PathVariable Long id){
        return whatsNewRepository.findById(id)
                .orElseThrow(() -> new WhatsNewNotFoundException(id));

    }


    @DeleteMapping("/whatsnew/delete/{id}")
    void deleteWhatsnewItem(@PathVariable Long id){
        whatsNewRepository.deleteById(id);
    }
}
