package br.com.jiankowalsi.loja;
import java.math.BigDecimal;
import java.util.Arrays;

import br.com.jiankowalsi.loja.pedido.GeraPedido;
import br.com.jiankowalsi.loja.pedido.acao.EnviarEmailPedido;
import br.com.jiankowalsi.loja.pedido.acao.LogDePedidos;
import br.com.jiankowalsi.loja.pedido.acao.SalvarPedidoDB;

public class TestePedidos {
    public static void main(String[] args) {
        var geraPedido = new GeraPedido("Ana da Cruz", new BigDecimal("100"), Arrays.asList(
            new EnviarEmailPedido(),
            new SalvarPedidoDB(),
            new LogDePedidos()
        ));
        geraPedido.executa();
    }
}
