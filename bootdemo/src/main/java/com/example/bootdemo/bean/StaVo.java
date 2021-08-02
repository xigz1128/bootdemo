package com.example.bootdemo.bean;

public class StaVo{
    private String SaleTime;
    private float WeeklySale;
    private String ProfitTime;
    private float WeeklyProfit;
    public String getSaleTime() {
        return SaleTime;
    }

    public void setSaleTime(String saleTime) {
        SaleTime = saleTime;
    }

    public float getWeeklySale() {
        return WeeklySale;
    }

    public void setWeeklySale(float weeklySale) {
        WeeklySale = weeklySale;
    }

    public float getWeeklyProfit() {
        return WeeklyProfit;
    }

    public void setWeeklyProfit(float weeklyProfit) {
        WeeklyProfit = weeklyProfit;
    }

    public String getProfitTime() {
        return ProfitTime;
    }

    public void setProfitTime(String profitTime) {
        ProfitTime = profitTime;
    }

}
