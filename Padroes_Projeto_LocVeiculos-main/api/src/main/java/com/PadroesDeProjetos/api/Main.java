package com.PadroesDeProjetos.api;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GerenciadorReservas gerenciadorReservas = GerenciadorReservas.getInstancia();
    private static final PatioVeiculos patioVeiculos = new PatioVeiculos();

    public static void main(String[] args) {
        System.out.println("\nBem-vindo ao Sistema de Reservas de Veículos!");

        while (true) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("\n* O que você gostaria de fazer?\n");
            System.out.println("-----MENU-----------------------------------------------------------");
            System.out.println("1. Fazer uma reserva");
            System.out.println("2. Cancelar uma reserva");
            System.out.println("3. Listar todas as reservas");
            System.out.println("4. Sair");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Escolha uma opção: ");


            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    fazerReserva();
                    break;
                case 2:
                    cancelarReserva();
                    break;
                case 3:
                    gerenciadorReservas.listarReserva();
                    break;
                case 4:
                    System.out.println("Obrigado por usar o sistema!");
                    return;
                default:
                    System.out.println(" >> Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void fazerReserva() {
        System.out.print("\nDigite seu nome e sobrenome: ");
        String cliente = scanner.nextLine();

        System.out.println("\nEscolha o tipo de veículo para a reserva:");
        System.out.println("Digite apenas uma das palavras abaixo, conforme sua escolha!");
        System.out.println("Carro, Van, Moto, Caminhonete");
        String tipoVeiculo = scanner.nextLine();

        Veiculo veiculo = patioVeiculos.getVehicle(tipoVeiculo.toLowerCase());

        System.out.print("\nData de início da reserva (dd/MM/yyyy): ");
        String dataInicioStr = scanner.nextLine();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("\nData de fim da reserva (dd/MM/yyyy): ");
        String dataFimStr = scanner.nextLine();
        LocalDate dataFim = LocalDate.parse(dataFimStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Reserva reserva = new Reserva(cliente, veiculo, dataInicio, dataFim);
        gerenciadorReservas.adicionarReserva(reserva);
    }

    private static void cancelarReserva() {
        if (gerenciadorReservas.getReservas().isEmpty()) {
            System.out.println(" >> Não há reservas cadastradas para cancelar.");
            System.out.println(" >> Retornando ao Menu Principal.");
        } else {
            System.out.print("Digite o UUID da reserva a ser cancelada: ");
            String idReservaStr = scanner.nextLine();
            UUID idReserva = UUID.fromString(idReservaStr);

            gerenciadorReservas.cancelarReserva(idReserva);
        }
    }
}
