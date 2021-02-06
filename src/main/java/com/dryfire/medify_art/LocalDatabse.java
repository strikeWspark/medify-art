package com.dryfire.medify_art;

import com.dryfire.medify_art.Models.OrderNow;
import com.dryfire.medify_art.Models.Trending;
import com.dryfire.medify_art.Models.WhatsNew;
import com.dryfire.medify_art.Repositories.OrderNowRepository;
import com.dryfire.medify_art.Repositories.TrendingRepository;
import com.dryfire.medify_art.Repositories.WhatsNewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class LocalDatabse {
    private static final Logger log = LoggerFactory.getLogger(LocalDatabse.class);

    @Bean
    CommandLineRunner initDatabase(TrendingRepository trendingRepository, WhatsNewRepository whatsNewRepository,
                                   OrderNowRepository orderNowRepository){
        return args -> {
            trendingRepository.save(new Trending.Builder().setTrending_image("Image 1").setTrending_small_brief("Joe win's the election").build());
            trendingRepository.save(new Trending.Builder().setTrending_image("Image 2").setTrending_small_brief("World just blew up!").build());

            trendingRepository.findAll().forEach(trending -> log.info("Preloaded" + trending));

            whatsNewRepository.save(new WhatsNew.Builder().setWhatsnew_image("Image 1").setWhatsnew_breif_description("Data item 1")
                    .setWhatsnew_small_brief("Data item").setUploaded_by("dryfire@medify.com").setName("dryFire").build());

            whatsNewRepository.save(new WhatsNew.Builder().setWhatsnew_image("Image 1").setWhatsnew_breif_description("Data item 1")
                    .setWhatsnew_small_brief("Data item").setUploaded_by("dryfire@medify.com").setName("dryFire").build());
            whatsNewRepository.save(new WhatsNew.Builder().setWhatsnew_image("Image 1").setWhatsnew_breif_description("Data item 1")
                    .setWhatsnew_small_brief("Data item").setUploaded_by("dryfire@medify.com").setName("dryFire").build());
            whatsNewRepository.findAll().forEach(whatsNew -> log.info("Preloaded data " + whatsNew));

          /*  orderNowRepository.save(new OrderNow("Keto Salad","Protein House",50.0f,300,"Keto", (ArrayList<String>) Arrays.asList(new String[]{"Cucumer", "Brocli", "Carrot"})));
            orderNowRepository.save(new OrderNow("Keto Salad","Protein House",50.0f,300,"Keto", (ArrayList<String>)Arrays.asList(new String[]{"Cucumer", "Brocli", "Carrot"})));
            orderNowRepository.save(new OrderNow("Keto Salad","Protein House",50.0f,300,"Keto", (ArrayList<String>)Arrays.asList(new String[]{"Cucumer", "Brocli", "Carrot"})));
            orderNowRepository.save(new OrderNow("Keto Salad","Protein House",50.0f,300,"Keto", (ArrayList<String>) Arrays.asList(new String[]{"Cucumer", "Brocli", "Carrot"})));

            orderNowRepository.findAll().forEach(orderNow -> log.info("Preloaded data "+ orderNow));
        */};
    }
}
