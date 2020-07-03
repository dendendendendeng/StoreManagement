package com.example.storemanagement.Good;

import java.io.Serializable;

public class Good implements Serializable {

    private String ID;
    private int remainNum;

    public Good() {
    }

    public Good(String ID, int remainNum) {
        this.ID = ID;
        this.remainNum = remainNum;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(int remainNum) {
        this.remainNum = remainNum;
    }
}
