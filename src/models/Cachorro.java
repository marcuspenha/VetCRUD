package models;

public class Cachorro extends Animal {

    public Cachorro(int id, String nome, int idade) {
        super(id, nome, idade, "Cachorro");
    }
    //Metodo herdado da superclasse
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public String toString() {
        return "Cachorro {" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", especie='" + getEspecie() + '\'' +
                '}';
    }
}
