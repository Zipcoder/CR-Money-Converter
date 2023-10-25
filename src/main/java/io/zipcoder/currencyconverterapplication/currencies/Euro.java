package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.EURO;

    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result= currencyType.getRate()/ CurrencyType.EURO.getRate();
        return result;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
