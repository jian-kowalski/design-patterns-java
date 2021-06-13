package br.com.jiankowalsi.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.exception.DomainException;
import br.com.jiankowalsi.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
       return orcamento.getValor().multiply(BigDecimal.ZERO);
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finalizar");
    }

}
