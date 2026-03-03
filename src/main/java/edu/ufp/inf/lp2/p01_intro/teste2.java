package edu.ufp.inf.lp2.p01_intro;

public class teste2 {

    public static void main(String[] args) {

        Date date1 = new Date((short) 18, (short) 5, 2003);
        Date date2 = new Date((short) 25, (short) 2, 2026);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Difference in days: " + date1.diferenceDays(date2));
        System.out.println("Difference in months: " + date1.diferenceMonths(date2));
        System.out.println("Difference in years: " + date1.diferenceYears(date2));
        /*wwwe*/
        return;
    }

}