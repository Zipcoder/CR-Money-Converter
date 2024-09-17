package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar extends CurrencyConverter implements ConvertableCurrency {

    private CurrencyType result = CurrencyType.US_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {
        Double universalAmount = currencyType.getRate() / CurrencyType.US_DOLLAR.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return result;
    }


}
