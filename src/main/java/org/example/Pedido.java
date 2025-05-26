package org.example;

import java.util.Observable;

public class Pedido extends Observable {

    private String hora;
    private String descricao;

    public Pedido(String hora, String descricao) {
        this.hora = hora;
        this.descricao = descricao;
    }

    public void atualizarEstado() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Hora: " + hora + ", Descrição" + descricao;
    }
}
