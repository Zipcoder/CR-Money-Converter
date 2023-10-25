package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.FRANC;
    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result= currencyType.getRate()/ CurrencyType.FRANC.getRate();
        return result;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
