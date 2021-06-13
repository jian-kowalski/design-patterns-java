package br.com.jiankowalsi.loja.orcamento;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.situacao.EmAnalise;
import br.com.jiankowalsi.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        var descontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(descontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

}