package com.company;

public class Main {

    public static void main(String[] args) {

        MoneyLabel USD = MoneyLabel.USD;
        MoneyLabel EURO = MoneyLabel.EURO;
        MoneyLabel JPY = MoneyLabel.JPY;
        MoneyLabel Bitcoin = MoneyLabel.Bitcoin;
        Rate usdRate = new Rate(USD, 1, 0.86, 111.88, 0.00039);

        Money JPYToUSD = new Money(usdRate, 100, Bitcoin);
        JPYToUSD.print();
        JPYToUSD.convertToUsd();
        System.out.println("");

        Money EuroToBit = new Money(usdRate, 100, EURO);
        EuroToBit.print();
        EuroToBit.convertToBitcoin();
        System.out.println("");

        Money YenToEuro = new Money(usdRate, 100, JPY);
        YenToEuro.print();
        YenToEuro.convertToEuro();
        System.out.println("");

        Money EuroToYen = new Money(usdRate, 100, EURO);
        EuroToYen.print();
        EuroToYen.convertToJpy();
        System.out.println("");
    }
}


