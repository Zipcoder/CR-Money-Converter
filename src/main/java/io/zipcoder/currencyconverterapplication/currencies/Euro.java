package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.EURO;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.EURO.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return type;
    }
}
