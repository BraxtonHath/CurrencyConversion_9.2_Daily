package com.company;

public class Rate {

        private MoneyLabel baseLabel;
        private double usdRate;
        private double euroRate;
        private double jpyRate;
        private double bitcoinRate;

        public Rate(MoneyLabel baseLabel, double usdRate, double euroRate, double jpyRate, double bitcoinRate) {
            this.usdRate = usdRate;
            this.euroRate = euroRate;
            this.jpyRate = jpyRate;
            this.bitcoinRate = bitcoinRate;
            this.baseLabel = baseLabel;
        }

        public MoneyLabel getBaseLabel() {
            return baseLabel;
        }

        public double getUsdRate() {
            return usdRate;
        }

        public double getEuroRate() {
            return euroRate;
        }

        public double getJpyRate() {
            return jpyRate;
        }

        public double getBitcoinRate() {
            return bitcoinRate;
        }
    }

