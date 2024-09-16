package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.FRANC;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.FRANC.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
