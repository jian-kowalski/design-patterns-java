package br.com.jiankowalsi.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.jiankowalsi.loja.pedido.acao.AcaoAposGerarPedido;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens, List<AcaoAposGerarPedido> acoes) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
        this.acoes = acoes;
    }

    public void executa() {
        var orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        var pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }

}
