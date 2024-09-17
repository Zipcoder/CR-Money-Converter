package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.UniversalCurrency;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate() / CurrencyType.getTypeOfCurrency(this).getRate();
    }
}
