package br.com.jiankowalsi.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        var orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        var pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);

        System.out.println("salvando no banco... ");
        System.out.println("enviando email... ");
        System.out.println("exibir... ");
        System.out.println(pedido.toString());

    }

}
