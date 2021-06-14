package br.com.jiankowalsi.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.jiankowalsi.loja.orcamento.ItemOrcamento;
import br.com.jiankowalsi.loja.orcamento.Orcamento;
import br.com.jiankowalsi.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, List<AcaoAposGerarPedido> acoes) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.acoes = acoes;
    }

    public void executa() {

        var item = new ItemOrcamento(this.valorOrcamento);
        var orcamento = new Orcamento();
        orcamento.adicionarItem(item);

        var pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);
        acoes.forEach(acao -> acao.executarAcao(pedido));
    }

}
