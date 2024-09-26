package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {


    default Double convert(CurrencyType currencyType) {
        //make this hoe call the currencyConverter?
        return currencyType.getRate()/CurrencyType.getTypeOfCurrency(this).getRate();
        //return Double.MAX_VALUE;
    }
}
