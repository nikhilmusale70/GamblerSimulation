package com.bridgelabz.gamblersimulation;

import java.util.Random;

public class GamblerSimulation {

    public static final int dailyStake=200;
    public static final int bet=1;
    public static final int percentage=50;

    public static void main(String[] args) {

        int totalMoney=dailyStake;
        do {
            if (winLoose() == 1) {            //for win
                totalMoney = totalMoney + 1;
                System.out.println("Congratulations you won" );
            } else {                           //for loss
                totalMoney = totalMoney - 1;
                System.out.println("Unfortunately you loose, Better luck next time" );
            }
        }while(totalMoney> dailyStake - dailyStake*StakePercent() && totalMoney< dailyStake + dailyStake*StakePercent());

        System.out.println("Resiging with "+totalMoney+ " money");
    }
    
    public static double StakePercent(){
        double percentStake = percentage/100.0;
        return percentStake;
    }
    public static int winLoose(){
        Random ran = new Random();
        int result = ran.nextInt(2);
        return result;
    }

}
