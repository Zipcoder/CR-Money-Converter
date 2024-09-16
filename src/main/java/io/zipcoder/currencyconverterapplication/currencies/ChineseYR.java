package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.CHINESE_YR;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.CHINESE_YR.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }
}
