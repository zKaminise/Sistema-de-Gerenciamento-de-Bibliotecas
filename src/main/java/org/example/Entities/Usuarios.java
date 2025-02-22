package org.example.Entities;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private List<Livros> livrosEmprestados;

    public boolean podePegarEmprestado() {
        return livrosEmprestados.size() < 5;
    }

    public void pegarLivro(Livros livros) {
        if (podePegarEmprestado()) {
            livrosEmprestados.add(livros);
            livros.emprestar();
        } else {
            System.out.println("Usuario atingiu o limite de livros emprestádos");
        }
    }

    public void devolverLivro(Livros livros) {
        livrosEmprestados.remove(livros);
        livros.devolver();
    }

    public Usuarios(String telefone, String cpf, String nome, int id) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Livros> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livros> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
