package com.codecool;

public class Aggressive extends Contractor {
    public Aggressive(Center center) {
        super(center);
    }

    @Override
    void changeAsset() {
        while (asset<3 && money>center.COSTOFASSET) {
                asset+=1;

        }
    }
}
