package controllers;

import models.Veterinario;
import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia as operações de CRUD (Criar, Ler, Atualizar, Deletar)
 * para a entidade {@link Veterinario}.
 * <p>
 * Simula um banco de dados em memória para os veterinários cadastrados
 * na clínica.
 */
public class VeterinarioController {

    // Lista que simula o banco de dados, armazenando todos os veterinários.
    private List<Veterinario> veterinarios = new ArrayList<>();

    // Gerador de ID sequencial para garantir que cada veterinário tenha um ID único.
    private int contadorId = 1;

    /**
     * Adiciona um novo veterinário à lista.
     * O ID é gerado automaticamente pelo controller.
     *
     * @param v O objeto {@link Veterinario} a ser cadastrado (vindo da interface).
     * @return O {@link Veterinario} cadastrado, agora com o ID atribuído.
     */
    public Veterinario create(Veterinario v) {
        // Define o ID único e incrementa o contador para o próximo
        v.setId(contadorId++);
        veterinarios.add(v);
        return v;
    }

    /**
     * Retorna a lista completa de todos os veterinários cadastrados.
     *
     * @return Uma {@link List} de {@link Veterinario}.
     */
    public List<Veterinario> list() {
        return veterinarios;
    }

    /**
     * Busca um veterinário específico na lista pelo seu ID.
     * <p>
     * Este método é essencial para a interface (Peão 2) validar se um
     * veterinário existe antes de criar uma {@link models.Consulta}.
     *
     * @param id O ID do veterinário a ser procurado.
     * @return O objeto {@link Veterinario} encontrado ou {@code null} se não for encontrado.
     */
    public Veterinario findById(int id) {
        // Itera pela lista de veterinários
        for (Veterinario v : veterinarios) {
            if (v.getId() == id) {
                return v; // Retorna o objeto assim que encontrar
            }
        }
        return null; // Retorna null se o loop terminar sem encontrar
    }

    /**
     * Atualiza os dados de um veterinário existente com base no ID.
     *
     * @param id   O ID do veterinário a ser atualizado.
     * @param novo Um objeto {@link Veterinario} com os *novos* dados.
     * @return {@code true} se a atualização foi bem-sucedida,
     * {@code false} se o veterinário não foi encontrado.
     */
    public boolean update(int id, Veterinario novo) {
        // Reutiliza o findById para localizar o veterinário a ser editado
        Veterinario existente = findById(id);

        // Se for nulo, o veterinário não existe na lista
        if (existente == null) {
            return false;
        }

        // Atualiza os dados do objeto "existente" (que está na lista)
        existente.setNome(novo.getNome());
        existente.setTelefone(novo.getTelefone());
        existente.setCrmv(novo.getCrmv()); // CRMV é o registro profissional

        return true;
    }

    /**
     * Remove um veterinário da lista com base no ID.
     *
     * @param id O ID do veterinário a ser removido.
     * @return {@code true} se a remoção foi bem-sucedida,
     * {@code false} se o veterinário não foi encontrado.
     */
    public boolean delete(int id) {
        // Localiza o veterinário que deve ser removido
        Veterinario v = findById(id);

        if (v == null) {
            return false; // Não encontrou, não pode remover
        }

        // O método .remove(Object) do ArrayList retorna true se conseguiu remover
        return veterinarios.remove(v);
    }
}