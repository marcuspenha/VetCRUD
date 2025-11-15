package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa a entidade Consulta (agendamento) na clínica.
 * <p>
 * Esta classe é um "Model" (POJO) que armazena os dados de um atendimento.
 * <p>
 * Ela serve como a "classe de ligação", conectando um {@link Animal}
 * e um {@link Veterinario} através de seus respectivos IDs
 * (animalId e veterinarioId).
 */
public class Consulta {

    private int id;
    private int animalId;       // "Chave estrangeira" para o Animal
    private int veterinarioId;  // "Chave estrangeira" para o Veterinario
    private LocalDate data;     // Tipo de data moderno do Java
    private String descricao;
    private double valor;

    /**
     * Construtor completo para criar um novo objeto Consulta.
     *
     * @param id            O ID da consulta (gerenciado pelo Controller).
     * @param animalId      O ID do Animal a ser atendido.
     * @param veterinarioId O ID do Veterinário que fará o atendimento.
     * @param data          A data em que a consulta foi/será realizada.
     * @param descricao     Um breve resumo (ex: "Vacina V10", "Check-up").
     * @param valor         O custo da consulta.
     */
    public Consulta(int id, int animalId, int veterinarioId, LocalDate data, String descricao, double valor) { //
        this.id = id;
        this.animalId = animalId;
        this.veterinarioId = veterinarioId;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    // --- Métodos Getters e Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public int getVeterinarioId() {
        return veterinarioId;
    }

    public void setVeterinarioId(int veterinarioId) {
        this.veterinarioId = veterinarioId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Sobrescreve o método toString() padrão.
     *
     * @return Uma representação textual (String) do objeto Consulta.
     */
    @Override
    public String toString() {
        // Formata a data para o padrão BR (dd/MM/yyyy)
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = (data != null) ? data.format(formatador) : "N/A";

        // ALTERAÇÃO: Usando String.format para uma saída mais limpa
        return String.format(
                "ID Consulta: %-3d | Data: %s | Animal (ID): %-3d | Vet (ID): %-3d | Valor: R$ %.2f | Descrição: %s",
                id,
                dataFormatada,
                animalId,
                veterinarioId,
                valor,
                descricao
        );
    }
}