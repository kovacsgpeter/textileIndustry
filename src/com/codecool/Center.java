package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Center {

    public List<Contractor> contractors;
    int numOfAssets;
    final int COSTOFASSET = 18;
    final int COSTOFOPERATION =6;

    public void setNumofAssets(){
        int nums = 0;
        for (Contractor c: contractors){
            nums +=c.getAsset();
        }
        numOfAssets=nums;

    }

    public int getNumOfAssets() {
        return numOfAssets;
    }

    public int getNumOfContractors() {
        return contractors.size();
    }

    public Center() {
        this.contractors = new ArrayList<>();
        this.numOfAssets = 0;
    }

    void init(){

        contractors.add(new Simple(this));
        contractors.add(new Aggressive(this));
        contractors.add(new Economic(this));
    }
}
