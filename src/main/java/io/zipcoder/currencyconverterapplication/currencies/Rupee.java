package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {

    private CurrencyType result = CurrencyType.RUPEE;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double universalAmount = currencyType.getRate() / CurrencyType.RUPEE.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return result;
    }
}
