package com.bridgelabz.gamblersimulation;

import java.util.Random;

public class GamblerSimulation {

    public static final int dailyStake=200;
    public static final int bet=1;
    public static final int percentage=50;

    public static void main(String[] args) {

        int day = 1;
        int month =1;
        int totalMoney=dailyStake;
        int unluckyDay=1;
        int luckyDay=1;
        int unluckyMonth=1;
        int luckyMonth=1;
        int unluckyDayMoney=dailyStake;
        int luckyDayMoney = dailyStake;

        while (month<=12) {

            day=1;
            while (day <= 30) {
                Random ran = new Random();
                totalMoney=dailyStake;
                int dailyGamePlayed = ran.nextInt(10);

                for (int i = 0; i < dailyGamePlayed; i++) {

                    if (winLoose() == 1)            //for win
                        totalMoney = totalMoney + 1;
                    else                            //for loss
                        totalMoney = totalMoney - 1;
                }
                if (unluckyDayMoney > totalMoney){
                    unluckyDay=day;
                    unluckyMonth=month;
                    unluckyDayMoney = totalMoney;

                }
                if(luckyDayMoney < totalMoney){
                    luckyDay=day;
                    luckyMonth=month;
                    luckyDayMoney = totalMoney;
                }

                day++;
            }
            month++;
        }

        System.out.println("Unlucly day :- " + unluckyDay + " Unlucky month :- " + unluckyMonth + " lost "+ (dailyStake-unluckyDayMoney) + "dollars");

        System.out.println("lucly day :- " + luckyDay + " lucky month :- " + luckyMonth + " won "+ (luckyDayMoney-dailyStake) + " dollars");
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