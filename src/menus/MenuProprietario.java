package menus;

import controllers.ProprietarioController;
import models.Proprietario;

import java.util.Scanner;

public class MenuProprietario {
    Scanner sc = new Scanner(System.in);
    ProprietarioController proprietarioController = new ProprietarioController();
    public void mostrarMenuProprietario() {
        int opcao;
        do {
            System.out.println("\n=== Menu Proprietário ===");
            System.out.println("1. Listar Proprietários");
            System.out.println("2. Criar Proprietários");
            System.out.println("3. Deletar Proprietários");
            System.out.println("4. Atualizar Proprietários");
            System.out.println("0. Voltar");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    proprietarioController.list();
                    break;
                case 2:
                    criarProprietaio();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    //Voltar para MenuPrincipal.
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while(opcao != 0);
    }

    public void criarProprietaio() {
        ProprietarioController proprietarioController = new ProprietarioController();
        Proprietario proprietario = new Proprietario();

        System.out.println("Nome: ");
        proprietario.setNome(sc.nextLine());
        sc.nextLine();

        System.out.println("Telefone: ");
        proprietario.setTelefone(sc.nextLine());
        sc.nextLine();

        System.out.println("Endereço:  ");
        proprietario.setEndereco(sc.nextLine());
        sc.nextLine();

        proprietarioController.create(proprietario);
        System.out.println("Proprietário Cadastrado!");

    }
}
