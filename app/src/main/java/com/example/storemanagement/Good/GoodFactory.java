package com.example.storemanagement.Good;

public class GoodFactory {

    public Good builtGood(){
        return new Good();
    }

    public Good builtGood(String ID,int remainNum){
        return new Good(ID,remainNum);
    }
}
