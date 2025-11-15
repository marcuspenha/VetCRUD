package controllers;

import models.Proprietario;
import java.util.ArrayList;
import java.util.List;

public class ProprietarioController {

    private List<Proprietario> proprietarios = new ArrayList<>();
    private int contadorId = 1;

    public Proprietario create(Proprietario p) {
        p.setId(contadorId++);
        proprietarios.add(p);
        return p;
    }

    public List<Proprietario> list() {
        return proprietarios;
    }

    public Proprietario findById(int id) {
        for (Proprietario p : proprietarios) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean update(int id, Proprietario novo) {
        Proprietario existente = findById(id);

        if (existente == null) {
            return false;
        }

        existente.setNome(novo.getNome());
        existente.setTelefone(novo.getTelefone());
        existente.setEndereco(novo.getEndereco());

        return true;
    }

    public boolean delete(int id) {
        Proprietario p = findById(id);

        if (p == null) {
            return false;
        }

        return proprietarios.remove(p);
    }
}
