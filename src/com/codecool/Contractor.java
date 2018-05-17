package com.codecool;

public abstract class Contractor {

    Center center;
    int money;
    int asset;
    int income;
    Boolean isBankrupt;


    public Contractor(Center center) {
        this.center = center;
        this.money=0;
        this.asset=1;
        this.isBankrupt=false;
    }

    int getAsset() {
        return asset;
    }

    void setIncome(){
        if (center.getNumOfAssets()<=center.getNumOfContractors()){
            income = 10;
        } else if (center.getNumOfAssets()>= 2*(center.getNumOfContractors())) {
            income =0;
        } else {
            income = 10*(center.getNumOfContractors()/center.getNumOfAssets());
        }
    }

    void changeMoney(){
        money += asset*income - asset*center.COSTOFOPERATION;
    }

    abstract void changeAsset();

    void dailyOperation(){
        if (!isBankrupt) {
            setIncome();
            changeMoney();
            if (money>=0) {
                changeAsset();
            } else {
              isBankrupt=true;
                System.out.println(this.getClass().getSimpleName() + " : is bankrupt");
            }
            System.out.println(this.getClass().getSimpleName()
                    + ": money: " + this.money + " asset: " +
                    this.asset);
        }


    }


}
