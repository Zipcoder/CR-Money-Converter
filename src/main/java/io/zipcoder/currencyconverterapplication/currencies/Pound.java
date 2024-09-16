package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.POUND;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.POUND.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
