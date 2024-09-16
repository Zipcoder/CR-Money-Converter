package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter implements ConvertableCurrency{
    public static Double convert(Double amountOfBaseCurrency,
                                 ConvertableCurrency sourceCurrencyType,
                                 CurrencyType targetCurrencyType) {
        return sourceCurrencyType.convert(targetCurrencyType) *
                amountOfBaseCurrency;
    }


    @Override
    public CurrencyType getType() {
        return null;
    }
}
