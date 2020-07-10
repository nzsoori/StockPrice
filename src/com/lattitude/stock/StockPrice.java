package com.lattitude.stock;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class StockPrice {
    public static void main(String[] args) {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        int bestprofit =getMaxProfit(stockPrices);
        System.out.print("Max profit earned is " + bestprofit+"$");
    }
    public static int getMaxProfit(@NotNull int[] stockPrices) {
        final int[] minBuy = {stockPrices[0]};
        final int[] maxSell = {Integer.MIN_VALUE};
        final int[] bestProfit = {Integer.MIN_VALUE};
        IntStream.range(1, stockPrices.length).forEach((x) ->{
            int currentProfit = stockPrices[x] - minBuy[0];
            if(currentProfit > bestProfit[0]) bestProfit[0] = currentProfit;
            if(stockPrices[x] < minBuy[0]) minBuy[0] = stockPrices[x];
        });
        maxSell[0]=minBuy[0]+bestProfit[0];

        System.out.println("returns "+bestProfit[0]+" (buy at $"+minBuy[0]+" sell at $"+maxSell[0]+")");
        return bestProfit[0];
    }
}


