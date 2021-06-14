package br.com.jiankowalsi.loja.imposto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public abstract class Imposto {

    private Imposto proxImposto;

    public Imposto(Imposto proxImposto) {
        this.proxImposto = proxImposto;
    }

    protected abstract BigDecimal realizarCalulo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalulo(orcamento);
        BigDecimal valorImpostoProx = BigDecimal.ZERO;
        if (proxImposto != null) {
            valorImpostoProx = proxImposto.calcular(orcamento);
        }
        return valorImposto.add(valorImpostoProx);
    }

}
