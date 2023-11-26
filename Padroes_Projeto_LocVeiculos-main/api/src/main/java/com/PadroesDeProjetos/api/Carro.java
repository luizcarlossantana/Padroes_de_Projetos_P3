package com.PadroesDeProjetos.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Carro implements Veiculo{

    private static final double PRECO_DIARIA = 100.00;
    private ModelosDeCarro modelo;

    public Carro(ModelosDeCarro modelo) {
        this.modelo = modelo;
    }

    public Carro() {
    }

    @Override
    public ModelosDeCarro getModelo() {
        return this.modelo;
    }

    @Override
    public String getTipo(){
        return "Carro";
    }

    @Override
    public double getPrecoDiaria() {
        return PRECO_DIARIA;
    }


    public ModelosDeCarro setModelo(ModelosDeCarro modeloRecebido){
        return this.modelo =modeloRecebido;
    }
}

