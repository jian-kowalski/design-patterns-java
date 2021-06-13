package br.com.jiankowalsi.loja.desconto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

    protected SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }

}
