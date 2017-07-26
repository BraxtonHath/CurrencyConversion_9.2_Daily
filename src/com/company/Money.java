package com.company;


public class Money {

    private MoneyLabel USD = MoneyLabel.USD;
    private MoneyLabel EURO = MoneyLabel.EURO;
    private MoneyLabel JPY = MoneyLabel.JPY;
    private MoneyLabel Bitcoin = MoneyLabel.Bitcoin;

    private Rate rate;
    private double Amount;
    private MoneyLabel moneyLabel;

    public Money(Rate rate, double moneyAmount, MoneyLabel moneyLabel) {
        this.rate = rate;
        this.Amount = moneyAmount;
        this.moneyLabel = moneyLabel;
    }

    public MoneyLabel getMoneyLabel() {
        return moneyLabel;
    }

    public void convertToBase() {
        if (moneyLabel != rate.getBaseLabel()) {
            if (moneyLabel == USD) {
                Amount = Amount / rate.getUsdRate();
            } else if (moneyLabel == EURO) {
                Amount = Amount / rate.getEuroRate();
            } else if (moneyLabel == JPY) {
                Amount = Amount / rate.getJpyRate();
            } else if (moneyLabel == Bitcoin) {
                Amount = Amount / rate.getBitcoinRate();
            }
            moneyLabel = rate.getBaseLabel();
            System.out.println("Converting...");
        }
    }

    public void convertToUsd() {
        if (moneyLabel != USD) {
            convertToBase();
            moneyLabel = USD;
            Amount = Amount * rate.getUsdRate();
            print();
        }
    }
    public void convertToEuro() {
        if (moneyLabel != EURO) {
            convertToBase();
            moneyLabel = EURO;
            Amount = Amount * rate.getEuroRate();
            print();
        }
    }
    public void convertToJpy() {
        if (moneyLabel != JPY) {
            convertToBase();
            moneyLabel = JPY;
            Amount = Amount * rate.getJpyRate();
            print();
        }
    }
    public void convertToBitcoin() {
        if (moneyLabel != Bitcoin) {
            convertToBase();
            moneyLabel = Bitcoin;
            Amount = Amount * rate.getBitcoinRate();
            print();
        }
    }
    public void print() {
        System.out.println(getMoneyLabel() + " " + Amount);
    }
}



//
//    private String name;
//    private double rate;
//    private double euroRate = 0.858679;
//    private double yenRate = 111.580;
//    private double bitCoinRate = 0.000395603;
//
//
//     public Money(String name, double rate) {
//         this.name = name;
//         this.rate = rate;
//     }
//
//
//     public double toJYP() {
//         rate = input / yenRate;
//         return rate;
//     }
//
//    public static void run() {
//                System.out.println("Type the number of the currency from the list: \n1 - US dollars \n2 - Euros \n3 - Yen \n4 - BitCoin \n");
//                System.out.println("Choose the starting currency:");
//
//                Scanner accept = new Scanner(System.in);
//
//                int currencyList = accept.nextInt();
//
//                String currencyType = "";
//                switch (currencyList) {
//                    case 1:
//                        currencyType = "US Dollars ";
//                        break;
//                    case 2:
//                        currencyType = "Euros ";
//                        break;
//                    case 3:
//                        currencyType = "Yen ";
//                        break;
//                    case 4:
//                        currencyType = "Bitcoin ";
//                        break;
//                    default:
//                        System.out.println("pick a number from the list the program & enter a number from the list.");
//                        return;
//                }
//                System.out.println("Choose the currency you wish to get back");
//                int convertedTo = accept.nextInt();
//
//                System.out.println("Enter the amount of " + currencyType+ " you wish to convert");
//                double input = accept.nextDouble();
//        /*
//            USDollar usd = new USDollar(12);
//            Money dunno = new Money(12, "USD");
//
//            JPYMoney jpy = usd.toJPY();
//         */
//                if (currencyType != "US Dollars");
//                Money jpy = input.toJPY();
//
//
//            }
//        }




