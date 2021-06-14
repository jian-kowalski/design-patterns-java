package br.com.jiankowalsi.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.jiankowalsi.loja.orcamento.situacao.EmAnalise;
import br.com.jiankowalsi.loja.orcamento.situacao.Finalizado;
import br.com.jiankowalsi.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orsavel {

    private BigDecimal valor;
    private List<Orsavel> itens;
    private SituacaoOrcamento situacao;

    @Override
    public String toString() {
        return "Orcamento [valor=" + valor + "]";
    }


    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
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
        return this.situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orsavel orsavel){
        this.itens.add(orsavel);
        this.valor.add(orsavel.getValor());
    }

}