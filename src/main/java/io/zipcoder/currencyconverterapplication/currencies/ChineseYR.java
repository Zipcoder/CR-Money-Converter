package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {

    private CurrencyType result = CurrencyType.CHINESE_YR;
    @Override
    public Double convert(CurrencyType currencyType) {
        Double universalAmount = currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
        return universalAmount;
    }

    @Override
    public CurrencyType getType() {
        return result;
    }
}
