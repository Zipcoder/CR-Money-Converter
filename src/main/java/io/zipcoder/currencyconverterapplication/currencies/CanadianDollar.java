package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.CANADIAN_DOLLAR;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.CANADIAN_DOLLAR.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
