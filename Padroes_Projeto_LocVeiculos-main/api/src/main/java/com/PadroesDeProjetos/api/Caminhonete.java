package com.PadroesDeProjetos.api;

public class Caminhonete implements Veiculo{

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
