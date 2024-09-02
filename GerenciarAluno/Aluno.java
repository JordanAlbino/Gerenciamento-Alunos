package GerenciarAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
     String nome;
     List<Double> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0;
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Notas: " + notas + ", Média: " + calcularMedia();
    }
}

