package br.com.jiankowalsi.loja.pedido.acao;

import br.com.jiankowalsi.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email para o pedido: " + pedido.toString());
    }
    
}
