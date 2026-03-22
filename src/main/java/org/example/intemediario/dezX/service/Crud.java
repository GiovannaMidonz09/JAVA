package org.example.intemediario.dezX.service;
import org.example.intemediario.dezX.model.Ninja;
import java.util.ArrayList;


public class Crud {
    private ArrayList<Ninja> ninjas = new ArrayList<>();

        public void adicionar(Ninja ninja){
            ninjas.add(ninja);
            System.out.println("NINJA " + ninja.getNome() + "CADASTRADO COM SUCESSO!");
        }

    public void exibirTodos() {
        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado.");
            return;
        }
        for (int i = 0; i < ninjas.size(); i++) {
            System.out.println("[" + i + "] " + ninjas.get(i));
        }
    }

    // UPDATE - Altera o nome pelo índice
    public void alterarNome(int indice, String novoNome) {
        if (indice >= 0 && indice < ninjas.size()) {
            ninjas.get(indice).setNome(novoNome);
            System.out.println("Nome atualizado!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // DELETE - Remove pelo índice
    public void remover(int indice) {
        if (indice >= 0 && indice < ninjas.size()) {
            Ninja removido = ninjas.remove(indice);
            System.out.println("Ninja " + removido.getNome() + " removido.");
        } else {
            System.out.println("Índice inválido.");
        }
    }


}
