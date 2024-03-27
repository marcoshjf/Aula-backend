package org.example;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OscarService {
    private List<Indicar> indicados;
    public OscarService() {
        indicados = new ArrayList<>();
    }
    public void adicionarIndicacao(Indicavel indicavel, String categoria) {
        if (indicavel.isElegivel()) {
            indicavel.incrementarIndicacoes();
            indicados.add(new Indicar(indicavel, categoria));
        } else {
            System.out.println("Este indicável não é elegível.");
        }
    }
    public List<Indicar> listarIndicados() {
        return indicados;
    }
}