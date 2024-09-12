package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.EURO;

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
