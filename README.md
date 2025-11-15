# Sistema CRUD para Clínica Veterinária Pet

Este é um projeto acadêmico para a disciplina de **Introdução à Orientação a Objetos e Estrutura de Dados** da UNINASSAU, ministrada pelo professor **Antonio Araújo Rodrigues**.

O objetivo é desenvolver um sistema CRUD (Create, Read, Update, Delete) totalmente funcional no console para uma clínica veterinária fictícia. O foco principal do projeto é a aplicação prática dos **4 pilares da Programação Orientada a Objetos (POO)**: Abstração, Encapsulamento, Herança e Polimorfismo.

##  Arquitetura e Estrutura

Para garantir a organização e a separação de responsabilidades, o projeto foi dividido nas seguintes camadas:

* **`models/`**: Contém as classes de entidade (Abstração) que representam os dados do sistema.
    * `Animal` (Superclasse) 
    * `Cachorro` (Subclasse) 
    * `Gato` (Subclasse) 
    * `Proprietario` 
    * `Veterinario` 
    * `Consulta` 
* **`controllers/`**: Contém as classes com a lógica de negócios e as operações de CRUD, gerenciando os dados (simulados em `ArrayLists`).
* **`menus/`** e **`Main.java`**: Camada de interface com o usuário, responsável por exibir os menus no console, coletar dados e interagir com os `Controllers`.

##  Funcionalidades e Pilares da POO

O sistema implementa as operações de CRUD para as principais entidades, demonstrando os conceitos da POO:

* **CRUD Completo:** É possível cadastrar, listar, atualizar e remover Proprietários, Animais (Cachorros e Gatos), Veterinários e Consultas.
* **Herança:** As classes `Cachorro` e `Gato` herdam da superclasse `Animal`, reutilizando atributos e métodos comuns.
* **Polimorfismo:** O método `emitirSom()` é implementado de forma diferente nas subclasses, permitindo que um `Cachorro` "lata" e um `Gato` "mie" através da mesma chamada.
* **Encapsulamento:** Todos os atributos das classes `models` são privados, e o acesso é feito exclusivamente através de métodos `getters` e `setters`.
* **Relatórios:** O sistema pode exibir uma listagem completa dos dados cadastrados.

##  Como Executar

Este projeto foi desenvolvido para ser executado em uma IDE Java (como o **IntelliJ**, conforme sugerido na descrição do trabalho).

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/marcuspenha/VetCRUD.git](https://github.com/marcuspenha/VetCRUD.git)
    ```
2.  Abra o projeto na sua IDE Java (IntelliJ, Eclipse, VS Code, etc.).
3.  Localize o arquivo `ClinicaPetMain.java` (ou `Main.java`).
4.  Execute o método `main()` para iniciar o programa no console.

## Autor

* Marcus Gutierrz Vieira Penha
* Marcos Vinicius Fernandes Sabino
