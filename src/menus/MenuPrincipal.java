package menus;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner sc = new Scanner(System.in);
    MenuAnimal menuAnimal = new MenuAnimal();

    public void mostrarMenuPrincipal() {
        int opcao;

        do {
            System.out.println("\n=== Clinica Veterinária - Menu Principal ===");
            System.out.println("1. Gerenciar Animais");
            System.out.println("2. Gerenciar Proprietários");
            System.out.println("3. Gerenciar Serviços");
            System.out.println("4. Gerar Relatórios");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    menuAnimal.mostrarMenuAnimal();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente Novamente.");
                    break;


            }
        } while(opcao != 0);

    }
}
