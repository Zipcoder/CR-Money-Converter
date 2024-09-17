package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    private CurrencyType result = CurrencyType.AUSTRALIAN_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double universalAmount = currencyType.getRate() / CurrencyType.AUSTRALIAN_DOLLAR.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return result;
    }
}
