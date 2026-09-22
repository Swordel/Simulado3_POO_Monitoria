package com.simulado3;

public enum Denom {
    BTC, ETH, SOL, SUI, ADA; //bitcoin,  ethereum, solana, sui, cardano

    public static boolean isSOLBTC(Denom d){
        return d == SOL || d == BTC;
    }

    public static boolean isETH(Denom d){
        return d == ETH;
    }

    public static boolean isADA(Denom d){
        return d == ADA;
    }

    public static boolean isSUI(Denom d){
        return d == SUI;
    }
}
