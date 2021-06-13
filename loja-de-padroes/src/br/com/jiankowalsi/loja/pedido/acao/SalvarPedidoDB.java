package br.com.jiankowalsi.loja.pedido.acao;

import br.com.jiankowalsi.loja.pedido.Pedido;

public class SalvarPedidoDB implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados " + pedido.toString());
    }
    
}
