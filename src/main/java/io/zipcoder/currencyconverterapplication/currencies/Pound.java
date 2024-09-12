package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.POUND;

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
