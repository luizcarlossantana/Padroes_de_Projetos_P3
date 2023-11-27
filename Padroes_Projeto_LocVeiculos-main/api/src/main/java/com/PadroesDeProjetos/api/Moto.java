package com.PadroesDeProjetos.api;

public class Moto implements Veiculo{
    @Override
    public String getModelo() {
        return null;
    }

    public static final double PRECO_DIARIA = 50.00;

    @Override
    public String getTipo(){
        return "Moto";
    }

    @Override
    public double getPrecoDiaria(){
        return PRECO_DIARIA;
    }
}
