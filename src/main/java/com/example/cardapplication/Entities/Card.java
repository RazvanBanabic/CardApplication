package com.example.cardapplication.Entities;

public class Card {

    String cardType;
    String cardValue;

    public Card(String cardType, String cardValue) {
        this.cardType = cardType;
        this.cardValue = cardValue;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardValue() {
        return cardValue;
    }

    public void setCardValue(String cardValue) {
        this.cardValue = cardValue;
    }
}
