package com.PadroesDeProjetos.api;

public class PatioVeiculos {

    public Veiculo getVehicle(String type) {
        if (type.equals("carro")) {
            return new Carro();
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
}

