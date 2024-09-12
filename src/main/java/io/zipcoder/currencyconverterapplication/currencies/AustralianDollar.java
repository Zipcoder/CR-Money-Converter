package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.AUSTRALIAN_DOLLAR;


    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
