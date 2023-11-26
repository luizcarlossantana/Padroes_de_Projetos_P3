package com.PadroesDeProjetos.api;

import java.util.List;

public class PatioVeiculos {



    public Veiculo getVehicle(String type, int modelo) {
        if (type.equals("carro")) {

            Carro carro = new Carro();
            ModelosDeCarro modeloRecebido= modelo(modelo);

            carro.setModelo(modeloRecebido);

            return carro;

        } else if (type.equals("van")) {
            return new Van();
        } else if (type.equals("moto")) {
            return new Moto();
        } else if (type.equals("caminhonete")) {
            return new Caminhonete();
        } else {
            throw new IllegalArgumentException("Tipo de veículo não disponível.");
        }
    }

    public ModelosDeCarro modelo(int modelo) {


        if (modelo == 1) {
            return ModelosDeCarro.CORALA_SEDAN;
        } else if (modelo == 2) {
            return ModelosDeCarro.FERRARI_SPORT;

        } else if (modelo == 3) {
            return ModelosDeCarro.HB20_SEDAN;

        } else if (modelo == 4) {
            return ModelosDeCarro.MOBI_HATCH;

        } else if (modelo == 5) {
            return ModelosDeCarro.ONIX_SEDAN;

        } else if (modelo == 6) {
            return ModelosDeCarro.SANDERO_HATCH;

        }else {
            throw new IllegalArgumentException("Tipo de veículo não disponível.");
        }
    }
}

