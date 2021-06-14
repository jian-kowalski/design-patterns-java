package br.com.jiankowalsi.loja.pedido.acao;

import br.com.jiankowalsi.loja.pedido.Pedido;

public class LogDePedidos implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
       System.out.println("Pedido gerado:" + pedido.toString());
    }
    
}
