package models;

/**
 * Representa a **Abstração** de um Animal na clínica.
 * <p>
 * Esta é uma classe {@code abstract}, o que significa que não pode ser
 * instanciada diretamente (você não pode criar um "new Animal()").
 * <p>
 * Ela serve como a **Superclasse** (pilar da Herança) para classes mais
 * específicas como {@link Cachorro} e {@link Gato}, definindo os atributos e
 * comportamentos comuns a todos os animais.
 * <p>
 * Todos os atributos são privados, demonstrando o **Encapsulamento**.
 */
public abstract class Animal {

    // Atributos da Classe
    private int id;
    private String nome;
    private int idade;
    private String especie;
    /**
     * ALTERAÇÃO ESTRUTURAL:
     * Adicionado ID do proprietário para criar o relacionamento.
     * Isso permite que um Animal "saiba" quem é seu dono.
     */
    private int proprietarioId;

    /**
     * Construtor da classe base Animal.
     * Chamado pelas subclasses (Cachorro, Gato) para inicializar os atributos comuns.
     *
     * @param id             O ID do animal (será gerenciado pelo Controller).
     * @param nome           O nome do animal (ex: "Rex", "Mimi").
     * @param idade          A idade do animal.
     * @param especie        A espécie (ex: "Canino", "Felino").
     * @param proprietarioId O ID do {@link Proprietario} dono deste animal.
     */
    public Animal(int id, String nome, int idade, String especie, int proprietarioId) { //
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.proprietarioId = proprietarioId; //
    }

    //Construtor Vazio.
    public Animal() {
    }

    // --- Métodos Especiais (Getters e Setters) ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getProprietarioId() {
        return proprietarioId;
    }

    public void setProprietarioId(int proprietarioId) {
        this.proprietarioId = proprietarioId;
    }

    // --- Métodos de Comportamento ---

    /**
     * Método abstrato para demonstrar **Polimorfismo**.
     * <p>
     * ALTERAÇÃO ESTRUTURAL: Alterado de 'void' para 'String'.
     * O model (Peão 1) não deve imprimir no console (System.out).
     * Ele deve retornar o dado (o som) para a Interface (Peão 2) decidir
     * o que fazer com ele.
     * <p>
     * Por ser {@code abstract}, este método *obriga* todas as subclasses
     * (Cachorro, Gato) a implementarem sua própria versão.
     *
     * @return Uma String representando o som do animal.
     */
    public abstract String emitirSom(); //

    /**
     * Sobrescreve o método toString() padrão.
     * Útil para a interface (Peão 2) listar os animais de forma
     * formatada no console.
     *
     * @return Uma representação textual (String) do objeto Animal.
     */
    @Override
    public String toString() {
        // ALTERAÇÃO: Usando String.format para uma saída mais limpa
        return String.format(
                "ID: %-3d | Espécie: %-8s | Nome: %-15s | Idade: %-2d | Dono (ID): %d",
                id,
                especie,
                nome,
                idade,
                proprietarioId
        );
    }
}