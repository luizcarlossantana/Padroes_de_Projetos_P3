package com.PadroesDeProjetos.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GerenciadorReservas {

    //private static int contadorIdReserva = 0;

    private static GerenciadorReservas instancia;

    private List<Reserva> reservas;

    private GerenciadorReservas(){
        reservas = new ArrayList<>();
    }

    public static GerenciadorReservas getInstancia(){
        if (instancia == null){
            instancia = new GerenciadorReservas();
        }
        return instancia;
    }

    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
        System.out.println(" >> Reserva adicionada com sucesso!");
        imprimirDetalhesReserva(reserva);
    }

    public void imprimirDetalhesReserva(Reserva reserva){
        System.out.println("-- DETALHES DA RESERVA ---------------------------------------------");
        System.out.println("ID: " + reserva.getIdReserva());
        System.out.println("Nome do Cliente: " + reserva.getCliente());
        System.out.println("Veículo reservado: " + reserva.getVeiculo().getTipo());
        System.out.println("Data da retirada do veículo: " + reserva.getDataInicio());
        System.out.println("Data da devolução do veículo: " + reserva.getDataFim());
        System.out.println("Valor da reserva: R$ " + reserva.getPreco());
    }

    public void listarReserva(){
        if (reservas.isEmpty()){
            System.out.println(" >> Não há reservas cadastradas!");
            System.out.println(" >> Retornando ao Menu principal");
        } else {
            for (Reserva reserva : reservas){
                imprimirDetalhesReserva(reserva);
            }
        }
    }

    public void cancelarReserva(UUID idReserva){
        if (reservas.isEmpty()){
            System.out.println(" >> Não há reservas cadastradas para cancelar.");
            return;
        }
        boolean removido = reservas.removeIf(reserva -> reserva.getIdReserva().equals(idReserva));
        if (removido){
            System.out.println(" >> Reserva cancelada com sucesso: ID "+ idReserva);
        } else {
            System.out.println(" >> Reserva não localizada: ID " + idReserva);
        }
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
