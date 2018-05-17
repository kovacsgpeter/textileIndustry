package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class HQ {

    List<Center> centers = new ArrayList<>();


    void init(){
        centers.add(new Center());
        for (Center c: centers){
            c.init();
        }
    }
     void Day(int numofDays){
         for (Center cent: centers) {
             for (int i = 0; i < numofDays; i++) {
                 cent.setNumofAssets();
                 for (Contractor c : cent.contractors) {
                     c.dailyOperation();
                 }
             }
         }

    }

    public static void main(String[] args) {
        HQ bp = new HQ();
        bp.init();
        bp.Day(12);




    }
}
