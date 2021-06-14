package br.com.jiankowalsi.loja.imposto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class ICMS extends Imposto {

    public ICMS(Imposto proxImposto) {
        super(proxImposto);
    }

    @Override
    protected BigDecimal realizarCalulo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

}
