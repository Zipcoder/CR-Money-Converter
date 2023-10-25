package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.UNIVERSAL_CURRENCY;
    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result = currencyType.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
        return result;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
