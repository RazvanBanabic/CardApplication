package com.example.cardapplication.Controllers;


import com.example.cardapplication.Entities.Card;
import com.example.cardapplication.Services.CardServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CardController {
    @GetMapping("/oneCard")
    Card oneCard(){
        return (new CardServices().oneCard());
    }

    @GetMapping("/getSomeCards")
    ArrayList<Card> getSomeCards(){
        return (new CardServices().getSomeCards());
    }
}
