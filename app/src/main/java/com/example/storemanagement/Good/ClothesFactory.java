package com.example.storemanagement.Good;

public class ClothesFactory extends GoodFactory {

    public Clothes builtClothes(){
        return new Clothes();
    }

    public Clothes builtClothes(String ID,int remainNum){
        return new Clothes(ID,remainNum);
    }
}
