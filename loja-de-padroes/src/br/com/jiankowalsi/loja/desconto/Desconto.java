package br.com.jiankowalsi.loja.desconto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximoDesconto;

    protected Desconto(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximoDesconto.calcular(orcamento);
    }


}
