package com.PadroesDeProjetos.api;

public class Caminhonete implements Veiculo{
    @Override
    public String getModelo() {
        return null;
    }

    private static final double PRECO_DIARIA = 250.00;

    @Override
    public String getTipo(){
        return "Caminhonete";
    }
    @Override
    public double getPrecoDiaria(){
        return PRECO_DIARIA;
    }


}
