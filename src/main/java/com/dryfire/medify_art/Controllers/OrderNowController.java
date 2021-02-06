package com.dryfire.medify_art.Controllers;

import com.dryfire.medify_art.Models.OrderNow;
import com.dryfire.medify_art.Repositories.OrderNowRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderNowController {

    private final OrderNowRepository orderNowRepository;

    public OrderNowController(OrderNowRepository orderNowRepository){
        this.orderNowRepository = orderNowRepository;
    }

    @GetMapping("/ordernow")
    List<OrderNow> message(){

        return orderNowRepository.findAll();
    }


}
