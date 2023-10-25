package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.RINGGIT;
    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result = currencyType.getRate() / CurrencyType.RINGGIT.getRate();
        return result;
    }


    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
