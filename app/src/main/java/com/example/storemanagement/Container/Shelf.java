package com.example.storemanagement.Container;

import com.example.storemanagement.Good.Good;

public class Shelf extends Container {
    private int goodType = 12;
    private Good[] goodsOfShelf = new Good[goodType];

    public Shelf() {
    }

    public Shelf(Good[] goodsOfShelf) {
        this.goodsOfShelf = goodsOfShelf;
    }

    public Good getGood(int n){
        return goodsOfShelf[n];
    }

    public void setGood(int n,Good good){
        goodsOfShelf[n] = good;
    }
}
