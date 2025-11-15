package models;

public class Veterinario {
    //Atributos da classe
    private int id;
    private String nome;
    private String telefone;
    private String crmv;

    //Construtor
    public Veterinario(int id, String nome, String telefone, String crmv) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.crmv = crmv;
    }

    //Getters e Setters
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    //toString para dados formatados
    @Override
    public String toString() {
        return "Veterinario {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", crmv='" + crmv + '\'' +
                '}';
    }
}
