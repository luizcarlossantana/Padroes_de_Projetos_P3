package com.PadroesDeProjetos.api;

public class Van implements Veiculo{

    private static final double PRECO_DIARIA = 300.00;

    @Override
    public String getTipo(){
        return "Van";
    }

    public double getPrecoDiaria(){
        return PRECO_DIARIA;
    }
}
