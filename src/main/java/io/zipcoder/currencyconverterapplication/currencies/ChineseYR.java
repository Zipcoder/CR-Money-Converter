package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.CHINESE_YR;
    @Override
    public  Double convert(CurrencyType currencyType) {
        Double result= currencyType.getRate()/ CurrencyType.CHINESE_YR.getRate();
        return result;
    }


    @Override
    public CurrencyType getType() {
        return this.type;
    }

}
