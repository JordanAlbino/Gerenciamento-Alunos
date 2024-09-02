package GerenciarAluno;

import java.util.HashMap;
import java.util.Map;

public class Escola {
    private Map<String, Aluno> alunos;

    public Escola() {
        this.alunos = new HashMap<>();
    }

    public void adicionarAluno(String nome) {
        if (!alunos.containsKey(nome)) {
            alunos.put(nome, new Aluno(nome));
        } else {
            System.out.println("Aluno já cadastrado.");
        }
    }

    public void adicionarNota(String nome, double nota) {
        Aluno aluno = alunos.get(nome);
        if (aluno != null) {
            aluno.adicionarNota(nota);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno);
        }
    }
}

