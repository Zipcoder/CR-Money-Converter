package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.CANADIAN_DOLLAR;

    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result= currencyType.getRate()/ CurrencyType.CANADIAN_DOLLAR.getRate();
        return result;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
