package com.PadroesDeProjetos.api;

public class Carro implements Veiculo{

    private static final double PRECO_DIARIA = 100.00;

    @Override
    public String getTipo(){
        return "Carro";
    }

    @Override
    public double getPrecoDiaria() {
        return PRECO_DIARIA;
    }
}
