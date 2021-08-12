package com.bridgelabz.gamblersimulation;

import java.util.Random;

public class GamblerSimulation {

    public static final int dailyStake=200;
    public static final int bet=1;

    public static void main(String[] args) {

        int totalMoney;
        if (winLoose()==1) {            //for win
            totalMoney = dailyStake + 1;
            System.out.println("Congratulations you won");
        }
        else {                           //for loss
            totalMoney = dailyStake - 1;
            System.out.println("Unfortunately you loose, Better luck next time");
        }
    }

    public static int winLoose(){
        Random ran = new Random();
        int result = ran.nextInt(2);
        return result;
    }

}
