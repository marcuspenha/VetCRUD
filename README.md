# Sistema CRUD para Clínica Veterinária Pet

[cite_start]Este é um projeto acadêmico para a disciplina de **Introdução à Orientação a Objetos e Estrutura de Dados** da UNINASSAU [cite: 3][cite_start], ministrada pelo professor **Antonio Araújo Rodrigues**[cite: 5].

[cite_start]O objetivo é desenvolver um sistema CRUD (Create, Read, Update, Delete) totalmente funcional no console para uma clínica veterinária fictícia[cite: 10, 11]. [cite_start]O foco principal do projeto é a aplicação prática dos **4 pilares da Programação Orientada a Objetos (POO)**: Abstração, Encapsulamento, Herança e Polimorfismo[cite: 15, 10].

## 🏛️ Arquitetura e Estrutura

Para garantir a organização e a separação de responsabilidades, o projeto foi dividido nas seguintes camadas:

* **`models/`**: Contém as classes de entidade (Abstração) que representam os dados do sistema.
    * [cite_start]`Animal` (Superclasse) [cite: 22]
    * [cite_start]`Cachorro` (Subclasse) [cite: 23]
    * [cite_start]`Gato` (Subclasse) [cite: 23]
    * [cite_start]`Proprietario` [cite: 26]
    * [cite_start]`Veterinario` [cite: 26]
    * [cite_start]`Consulta` [cite: 28]
* **`controllers/`**: Contém as classes com a lógica de negócios e as operações de CRUD, gerenciando os dados (simulados em `ArrayLists`).
* [cite_start]**`menus/`** e **`Main.java`**: Camada de interface com o usuário, responsável por exibir os menus no console[cite: 17], coletar dados e interagir com os `Controllers`.

## ✨ Funcionalidades e Pilares da POO

O sistema implementa as operações de CRUD para as principais entidades, demonstrando os conceitos da POO:

* [cite_start]**CRUD Completo:** É possível cadastrar, listar, atualizar e remover Proprietários, Animais (Cachorros e Gatos), Veterinários e Consultas[cite: 39, 40, 41, 42].
* [cite_start]**Herança:** As classes `Cachorro` e `Gato` herdam da superclasse `Animal`[cite: 36], reutilizando atributos e métodos comuns.
* [cite_start]**Polimorfismo:** O método `emitirSom()` é implementado de forma diferente nas subclasses[cite: 37], permitindo que um `Cachorro` "lata" e um `Gato` "mie" através da mesma chamada.
* [cite_start]**Encapsulamento:** Todos os atributos das classes `models` são privados, e o acesso é feito exclusivamente através de métodos `getters` e `setters`[cite: 34, 35].
* [cite_start]**Relatórios:** O sistema pode exibir uma listagem completa dos dados cadastrados[cite: 40].

## 🚀 Como Executar

[cite_start]Este projeto foi desenvolvido para ser executado em uma IDE Java (como o **IntelliJ**[cite: 17], conforme sugerido na descrição do trabalho).

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/marcuspenha/VetCRUD.git](https://github.com/marcuspenha/VetCRUD.git)
    ```
2.  Abra o projeto na sua IDE Java (IntelliJ, Eclipse, VS Code, etc.).
3.  [cite_start]Localize o arquivo `ClinicaPetMain.java` (ou `Main.java`)[cite: 30].
4.  Execute o método `main()` para iniciar o programa no console.

## Autor

Marcus Gutierrz Vieira Penha
