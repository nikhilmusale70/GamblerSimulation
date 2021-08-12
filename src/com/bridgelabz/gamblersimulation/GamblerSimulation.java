package com.bridgelabz.gamblersimulation;

import java.util.Random;
import java.util.Scanner;

public class GamblerSimulation {

    public static final int dailyStake=200;
    public static final int bet=1;
    public static final int percentage=50;
    public static final int daysInMonth=30;

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
        int monthIncome;

        while (month<=12) {

            monthIncome=0;
            day=1;
            while (day <= daysInMonth) {
                Random ran = new Random();
                totalMoney=dailyStake;
                int dailyGamePlayed = ran.nextInt(10);

                for (int i = 0; i < dailyGamePlayed; i++) {

                    if (winLoose() == 1)            //for win
                        totalMoney = totalMoney + 1;
                    else                            //for loss
                        totalMoney = totalMoney - 1;
                }
                day++;
                monthIncome=monthIncome+totalMoney;
            }
            if (monthIncome>(dailyStake*daysInMonth)) {
                System.out.println("You have won this month "+ month+" you have won " + monthIncome + " \nPress 1. to stop game \nPress 2. to continue");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                month++;
                if (choice == 1)
                    break;
                else if (choice == 2)
                    continue;
            }
        }

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