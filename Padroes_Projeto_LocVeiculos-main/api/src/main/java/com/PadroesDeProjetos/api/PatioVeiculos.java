package com.PadroesDeProjetos.api;

import java.util.List;

public class PatioVeiculos {



    public Veiculo getVehicle(String type,int modelo) {
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

    public void modelos(String type){

        if (type.equals("carro")) {


            System.out.println("\nQual modelo você deseja ? ");
            System.out.println("\n------------------MODELOS-------------------------");
            System.out.println("1. " + ModelosDeCarro.CORALA_SEDAN);
            System.out.println("2. " + ModelosDeCarro.FERRARI_SPORT);
            System.out.println("3. " + ModelosDeCarro.HB20_SEDAN);
            System.out.println("4. " + ModelosDeCarro.MOBI_HATCH);
            System.out.println("5. " + ModelosDeCarro.ONIX_SEDAN);
            System.out.println("6. " + ModelosDeCarro.SANDERO_HATCH);


        } else if (type.equals("van")) {

        } else if (type.equals("moto")) {

        } else if (type.equals("caminhonete")) {

        } else {
            throw new IllegalArgumentException("Tipo de veículo não disponível.");
        }
    }
    }


