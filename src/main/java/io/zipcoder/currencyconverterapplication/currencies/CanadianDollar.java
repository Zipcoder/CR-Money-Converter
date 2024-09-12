package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    public  Double convert(CurrencyType currencyType) {
        Double result= currencyType.getRate()/CurrencyType.CANADIAN_DOLLAR.getRate();
        return result;
    }
}
