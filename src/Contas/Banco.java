package Contas;

import Contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
