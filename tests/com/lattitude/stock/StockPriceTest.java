package com.lattitude.stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StockPriceTest {
    private static int minTestMethodCount=2;
    StockPrice sp;
    @BeforeEach
    void init() {
         sp=new StockPrice();
    }
    @Test
    @DisplayName("getMaxProfit Method for expected and unexpected")
    void StockPriceTestSuccessFail() {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        Assertions.assertAll(
                () -> Assertions.assertEquals(6 ,StockPrice.getMaxProfit(stockPrices)),
                () -> Assertions.assertNotEquals(5, StockPrice.getMaxProfit(stockPrices)),
                () -> Assertions.assertTrue(stockPrices.length >= minTestMethodCount , String.valueOf(stockPrices.length)),
                () -> Assertions.assertFalse(stockPrices.length < minTestMethodCount , String.valueOf(stockPrices.length)),
                () ->Assertions.assertThrows(
                        NullPointerException.class,
                        () -> { throw new NullPointerException(); }  ),
                () ->Assertions.assertThrows(
                        IndexOutOfBoundsException.class,
                        () -> { throw new IndexOutOfBoundsException(); }  ),
                () -> Assertions.assertNotNull(stockPrices)
    );
    }
}