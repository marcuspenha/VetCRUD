package controllers;

import models.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    //Lista onde todos os animais cadastrados vão ficar guardados enquanto o programa roda
    private List<Animal> animais = new ArrayList<>();
    private int contadorId = 1; //O controller incrementa automaticamente quando cria um novo animal

    // responsavel por inserir um novo animal no sistema
    public Animal create(Animal animal) {
        animal.setId(contadorId++);
        animais.add(animal);
        return animal;
    }

    public List<Animal> list() { //apenas devolve a lista inteira de animais
        return animais;
    }

    public Animal findById(int id) { // Esse é o metodo usado para localizar os animais
        for (Animal a : animais) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public boolean update(int id, Animal novoAnimal) { // Metodo Update, esse é o metodo de edição
        Animal existente = findById(id);

        if (existente == null) { // Se não encontrar retorna um false
            return false;
        }

        existente.setNome(novoAnimal.getNome());
        existente.setIdade(novoAnimal.getIdade());
        existente.setEspecie(novoAnimal.getEspecie());

        return true;
    }

    public boolean delete(int id) { // Metodo delete
        Animal a = findById(id);

        if (a == null) {  // Se não encontrar retorna um false
            return false;
        }

        return animais.remove(a); // Se encontrar remove da lista
    }
}
