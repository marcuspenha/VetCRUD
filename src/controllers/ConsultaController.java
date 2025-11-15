package controllers;

import models.Consulta;
import java.util.ArrayList;
import java.util.List;

public class ConsultaController {

    private List<Consulta> consultas = new ArrayList<>();
    private int contadorId = 1;

    public Consulta create(Consulta c) {
        c.setId(contadorId++);
        consultas.add(c);
        return c;
    }

    public List<Consulta> list() {
        return consultas;
    }

    public Consulta findById(int id) {
        for (Consulta c : consultas) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public boolean update(int id, Consulta nova) {
        Consulta existente = findById(id);

        if (existente == null) {
            return false;
        }

        existente.setAnimalId(nova.getAnimalId());
        existente.setVeterinarioId(nova.getVeterinarioId());
        existente.setData(nova.getData());
        existente.setDescricao(nova.getDescricao());
        existente.setValor(nova.getValor());

        return true;
    }

    public boolean delete(int id) {
        Consulta c = findById(id);

        if (c == null) {
            return false;
        }

        return consultas.remove(c);
    }
}
