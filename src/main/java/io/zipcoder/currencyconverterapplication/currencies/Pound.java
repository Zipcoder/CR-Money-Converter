package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.POUND;
    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result = currencyType.getRate() / CurrencyType.POUND.getRate();
        return result;
    }


    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
