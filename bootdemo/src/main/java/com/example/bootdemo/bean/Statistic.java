package com.example.bootdemo.bean;

public class Statistic {
    private String dish_id;
    private String dish_name;
    private String price;
    private String SaleAmount;
    private String TotalSale;
    private String Profit;
    private String order_id;
    private String user_id;
    private String amount;
    private String order_time;
    private String paytype;
    private String DaySale;
    private String DayProfit;
    private String TotalProfit;
    private String TotalSales;

    public String getDish_id() {
        return dish_id;
    }

    public void setDish_id(String dish_id) { this.dish_id = dish_id; }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) { this.price = price; }

    public String getSaleAmount() { return SaleAmount; }

    public void setSaleAmount(String saleAmount) { this.SaleAmount = saleAmount; }

    public String getTotalSale() { return TotalSale; }

    public void setTotalSale(String totalSale) { this.TotalSale = totalSale; }

    public String getProfit() { return Profit; }

    public void setProfit(String profit) { this.Profit = profit; }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getDaySale() {
        return DaySale;
    }

    public void setDaySale(String daySale) {
        DaySale = daySale;
    }

    public String getDayProfit() {
        return DayProfit;
    }

    public void setDayProfit(String dayProfit) {
        DayProfit = dayProfit;
    }

    public String getTotalProfit() {
        return TotalProfit;
    }

    public void setTotalProfit(String totalProfit) {
        TotalProfit = totalProfit;
    }

    public String getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(String totalSales) {
        TotalSales = totalSales;
    }
}
