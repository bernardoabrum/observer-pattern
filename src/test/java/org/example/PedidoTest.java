package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    static Cliente cliente;

    @BeforeAll
    public static void setup() {
        cliente = new Cliente("Marco Antonio");
    }

    @Test
    public void deveAtualizarClienteAoFazerPedido() {
        Pedido pedido = new Pedido("13:45", "Pedido criado!");
        cliente.pedir(pedido);
        pedido.atualizarEstado();
        String saida = "Marco Antonio, seu pedido foi atualizado: Hora: 13:45, DescriçãoPedido criado!";
        assertEquals(saida, cliente.getUltimaNotificacao());
    }

}
