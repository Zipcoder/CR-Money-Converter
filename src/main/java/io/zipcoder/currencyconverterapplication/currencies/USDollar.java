package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.US_DOLLAR;
    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result = currencyType.getRate() / CurrencyType.US_DOLLAR.getRate();
        return result;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
