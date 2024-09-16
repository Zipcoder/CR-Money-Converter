package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.YEN;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.YEN.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return type;
    }
}
