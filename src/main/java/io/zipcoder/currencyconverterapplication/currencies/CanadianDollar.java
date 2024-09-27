package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return ConvertableCurrency.super.convert(currencyType);
    }

    @Override
    public CurrencyType getCurrencyType() {
      return CurrencyType.CANADIAN_DOLLAR;
    }
}
