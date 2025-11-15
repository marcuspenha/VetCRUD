package models;

public class Gato extends Animal {

    public Gato(int id, String nome, int idade) {
        super(id, nome, idade, "Gato");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public String toString() {
        return "Gato {" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", especie='" + getEspecie() + '\'' +
                '}';
    }
}
