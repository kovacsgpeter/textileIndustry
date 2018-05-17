package com.codecool;

public class Economic extends Contractor{
    public Economic(Center center) {
        super(center);
    }

    @Override
    void changeAsset() {
        if (asset * center.COSTOFOPERATION < this.income) {
            while (asset < 3 && money > center.COSTOFASSET) {
                    asset += 1;
            }
        } else {
            while (asset>1 && (money<0 || asset*center.COSTOFOPERATION>income)) {
                   asset-=1;
            }
        }
    }
}
