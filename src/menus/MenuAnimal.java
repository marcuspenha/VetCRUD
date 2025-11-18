package menus;

import java.util.Scanner;

public class MenuAnimal {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenuAnimal() {
        int opcao;
        do {
            System.out.println("\n=== Gerenciar Animais ===");
            System.out.println("1. Listar Animais");
            System.out.println("2. Adicionar Animais");
            System.out.println("3. Atualizar Animais");
            System.out.println("0. Voltar");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    //Voltar para MenuPricipal.
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while(opcao != 0);
    }

}
