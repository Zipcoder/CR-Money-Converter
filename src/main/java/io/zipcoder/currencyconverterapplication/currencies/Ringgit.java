package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {

    private CurrencyType result = CurrencyType.RINGGIT;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double universalAmount = currencyType.getRate() / CurrencyType.RINGGIT.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return result;
    }
}
