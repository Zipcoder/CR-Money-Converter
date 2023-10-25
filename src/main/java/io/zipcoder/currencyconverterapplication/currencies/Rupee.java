package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.RUPEE;
    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result = currencyType.getRate() / CurrencyType.RUPEE.getRate();
        return result;
    }


    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
