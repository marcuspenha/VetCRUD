package menus;

import controllers.AnimalController;
import models.Cachorro;
import models.Gato;
import models.Proprietario;

import java.util.Scanner;

public class MenuAnimal {
    Scanner sc = new Scanner(System.in);
    AnimalController animalController = new AnimalController();


    public void mostrarMenuAnimal() {
        int opcao;
        do {
            System.out.println("\n=== Clinica Veterinária ===");
            System.out.println("---- Gerenciar Animais ----");
            System.out.println("1. Listar Animais");
            System.out.println("2. Adicionar Animais");
            System.out.println("3. Atualizar Animais");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("\n=== Animais Cadastrados ===");
                    animalController.list();
                    System.out.println("===========================");
                    break;
                case 2:
                    int opcao2;
                    do {
                        System.out.println("\n=== Adicionar Animais  ===");
                        System.out.println("1. Adicionar Cachorro");
                        System.out.println("2. Adicionar Gato");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha uma opção: ");
                        opcao2 = sc.nextInt();
                        sc.nextLine();


                        switch (opcao2) {
                            case 1:
                                System.out.println("\n=== Adicionar Cachorro  ===");
                                Cachorro cachorro = new Cachorro();
                                MenuProprietario menuProprietario = new MenuProprietario();

                                System.out.print("Nome: ");
                                cachorro.setNome(sc.nextLine());

                                System.out.print("Idade: ");
                                cachorro.setIdade(sc.nextInt());
                                sc.nextLine();
                                
                                menuProprietario.criarProprietaio();

                                animalController.create(cachorro);
                                System.out.println("Cachorro cadastrado!");
                                break;
                            case 2:

                                System.out.println("\n=== Adicionar Gato  ===");
                                Gato gato = new Gato();
                                System.out.print("Nome: ");
                                gato.setNome(sc.nextLine());

                                System.out.print("Idade: ");
                                gato.setIdade(sc.nextInt());

                                System.out.print("Sexo: ");
                                gato.setSexo(sc.nextLine());

                                System.out.print("Espécie: ");
                                gato.setEspecie(sc.nextLine());





                                



                                break;
                            case 3:
                                //Voltar para GerenciarAnimais.
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                    } while (opcao2 != 0);

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
