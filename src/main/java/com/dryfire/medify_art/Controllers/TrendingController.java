package com.dryfire.medify_art.Controllers;

import com.dryfire.medify_art.Exceptions.TrendingNotFoundException;
import com.dryfire.medify_art.Models.Trending;
import com.dryfire.medify_art.Repositories.TrendingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrendingController {

    private final TrendingRepository trendingRepository;

    TrendingController(TrendingRepository trendingRepository){
        this.trendingRepository = trendingRepository;
    }

    @GetMapping("/trendings")
    public List<Trending> all(){
        return trendingRepository.findAll();
    }

    @GetMapping("/trending/{id}")
    Trending one(@PathVariable Long id){
        return trendingRepository.findById(id)
                .orElseThrow(() -> new TrendingNotFoundException(id));
    }


}
