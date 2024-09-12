package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.YEN;


    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
