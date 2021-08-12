package com.bridgelabz.gamblersimulation;

import java.util.Random;

public class GamblerSimulation {

    public static final int dailyStake=200;
    public static final int bet=1;
    public static final int percentage=50;

    public static void main(String[] args) {

        int day = 1;
        int totalMoney=dailyStake;
        int unluckyDay=100;
        int luckyDay=100;

        while(day<=20){
            Random ran = new Random();
            int dailyGamePlayed = ran.nextInt(10);

            for (int i=0; i<dailyGamePlayed ;i++) {

                if (winLoose() == 1)            //for win
                    totalMoney = totalMoney + 1;

                else                            //for loss
                    totalMoney = totalMoney - 1;

            }
            if (unluckyDay > totalMoney){
                unluckyDay=totalMoney;
                unluckMonth=month
            }
            else {
                luckyDay = totalMoney;
            }
                day++;
        }
        if (totalMoney<dailyStake)
            System.out.println("After 20 days you have lost "+ (dailyStake - totalMoney)+ " Dollar");
        else
            System.out.println("After 20 days you have won "+ (totalMoney - dailyStake)+ " Dollar");
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
