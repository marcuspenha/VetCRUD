package models;
// Classe abstrata
public abstract class Animal {
    // Atributos da Classe
    private int id;
    private String nome;
    private int idade;
    private String especie;

    //Construtor
    public Animal (int id, String nome, int idade, String especie) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    // Metodos especiais (Getters e Setters)

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome (){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public int getIdade (){
        return idade;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public String getEspecie (){
        return especie;
    }
    public void setEspecie (String especie){
        this.especie = especie;
    }
    //metodo
     // Cada subclasse deve ter um som especifico
    public abstract void emitirSom();

    //toString
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                '}';
    }
}
