package controllers;

import models.Veterinario;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioController {

    private List<Veterinario> veterinarios = new ArrayList<>();
    private int contadorId = 1;

    public Veterinario create(Veterinario v) {
        v.setId(contadorId++);
        veterinarios.add(v);
        return v;
    }

    public List<Veterinario> list() {
        return veterinarios;
    }

    public Veterinario findById(int id) {
        for (Veterinario v : veterinarios) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public boolean update(int id, Veterinario novo) {
        Veterinario existente = findById(id);

        if (existente == null) {
            return false;
        }

        existente.setNome(novo.getNome());
        existente.setTelefone(novo.getTelefone());
        existente.setCrmv(novo.getCrmv());

        return true;
    }

    public boolean delete(int id) {
        Veterinario v = findById(id);

        if (v == null) {
            return false;
        }

        return veterinarios.remove(v);
    }
}
