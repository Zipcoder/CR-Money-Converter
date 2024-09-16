package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.US_DOLLAR;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.US_DOLLAR.getRate();
        return universalAmount;
    }

    public CurrencyType getType(){
        return type;
    }
}
