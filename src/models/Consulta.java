package models;

import java.time.LocalDate;

public class Consulta {

    private int id;
    private int animalId;
    private int veterinarioId;
    private LocalDate data;
    private String descricao;
    private double valor;

    public Consulta(int id, int animalId, int veterinarioId, LocalDate data, String descricao, double valor) {
        this.id = id;
        this.animalId = animalId;
        this.veterinarioId = veterinarioId;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

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

    @Override
    public String toString() {
        return "Consulta {" +
                "id=" + id +
                ", animalId=" + animalId +
                ", veterinarioId=" + veterinarioId +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
