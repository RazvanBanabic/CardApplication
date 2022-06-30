package com.example.cardapplication.Services;

import com.example.cardapplication.Entities.Card;

import java.util.ArrayList;

public class CardServices {

    ArrayList<Card> cardList = new ArrayList<Card>();

    public Card oneCard(){
        Card card = new Card("Hearts", "Ace");
        return card;
    }

    public void GetSomeMockCards(){
        cardList.clear();
        cardList.add(new Card("Diamonds", "Ten"));
        cardList.add(new Card("Clubs", "Nine"));
        cardList.add(new Card("Spades", "King"));
        cardList.add(new Card("Hearts", "Queen"));
        cardList.add(new Card("Spades", "Three"));

    }

    public ArrayList<Card> getSomeCards(){
        GetSomeMockCards();
        return cardList;
    }
}
