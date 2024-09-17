package io.zipcoder.currencyconverterapplication;

import java.util.Locale;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        for (CurrencyType value : CurrencyType.values()) {
            String name = value.name().replace("_", "").toLowerCase();
            String currencyName = currency.getClass().getSimpleName().toLowerCase();

            if (name.equals(currencyName)){
                return value;
            }

        }
        return null;
    }
}
